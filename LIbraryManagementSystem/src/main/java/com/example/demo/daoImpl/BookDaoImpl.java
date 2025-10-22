package com.example.demo.daoImpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.dao.IBooksDao;
import com.example.demo.entity.Author;
import com.example.demo.entity.Books;
import com.example.demo.entity.Member;
import com.example.demo.repo.IAuthorRepo;
import com.example.demo.repo.IBookRepo;
import com.example.demo.repo.IMemberRepo;
import com.example.demo.request.BookRequest;
import com.example.demo.request.BorrowedRequest;
import com.example.demo.request.ShowBorrowedBooksResponse;
import com.example.demo.response.BooksResponse;
import com.example.demo.response.BorrowedResponse;
import jakarta.transaction.Transactional;

@Component
public class BookDaoImpl implements IBooksDao {

	@Autowired
	private IBookRepo repo;
	
	@Autowired
	private IAuthorRepo authorRepo;
	
	@Autowired
	private IMemberRepo memberRepo;
	
	@Override
	public BooksResponse insertBooks(BookRequest request) {
		Books book = new Books();
		List<Author> author = new ArrayList<>();
		
		book.setTitle(request.getTitle());
		book.setDescription(request.getDescription());
		book.setPrice(request.getBookPrice());
		book.setStock(request.getBookStock());
		
		List<Integer> authorId = request.getAuthorId();
		for(Integer authorData  : authorId) {
			Author authorDetails = authorRepo.findById(authorData).get();
			if(authorDetails!=null) {
				author.add(authorDetails);
			}else {
				System.out.println("author not found");
			}
			book.setAuthor(authorDetails);
		}
		
		Books saveBooks = repo.save(book);
		BooksResponse response = new BooksResponse();
		response.setBookTitle(book.getTitle());
		response.setBookDesc(book.getDescription());
		response.setBookPrice(book.getPrice());
		response.setBookStock(book.getStock());
		List<String> byName = authorRepo.findByauthorName(authorId);
		response.setAuthorName(byName);
		return response;
	}

	@Override
	public List<BooksResponse> showBooks() {
		List<Books> books = repo.findAll();
		List<BooksResponse> response = new ArrayList<>();
		for(Books book : books) {
			BooksResponse res = new BooksResponse();
			res.setBookDesc(book.getDescription());
			res.setBookId(book.getId());
			res.setBookPrice(book.getPrice());
			res.setBookStock(book.getStock());
			res.setBookTitle(book.getTitle());
		
			List<String> authorNameFromBooks = authorRepo.findAuthorNameFromBooks(book.getId());
		    res.setAuthorName(authorNameFromBooks);

		    response.add(res);
		}
		return response;
	}

	@Override
	public BooksResponse findBook(Integer id) {
		BooksResponse response = new BooksResponse();
		Books book = repo.findById(id).get();
		response.setBookId(book.getId());
		response.setBookDesc(book.getDescription());
		response.setBookPrice(book.getPrice());
		response.setBookStock(book.getStock());
		response.setBookTitle(book.getTitle());
		List<String> authorNameFromBooks = authorRepo.findAuthorNameFromBooks(book.getId());
		response.setAuthorName(authorNameFromBooks);
		return response;
	}

	@Override
	public String deleteBooks(Integer id) {
		Books bookId = repo.findById(id).get();
		repo.deleteById(bookId.getId());
		return "Deleted";
		
	}

	@Override
	@Transactional
	public BorrowedResponse borrowBooks(BorrowedRequest request) {
		BorrowedResponse response = new BorrowedResponse();
		Books bookId = repo.findById(request.getBookId()).get();
		Member member = memberRepo.findById(request.getMemberId()).get();
		int update = repo.decreaseBookStock(request.getBookId());
		response.setBookId(request.getBookId());
		response.setMemberId(request.getMemberId());
		response.setBookTitle(bookId.getTitle());
		response.setBookStock(bookId.getStock()-1);
		response.setStatus("Borrowed SuccessFully");
		member.getBook().add(bookId);
		bookId.getMembers().add(member);
		return response;
	}

	@Override
	public List<ShowBorrowedBooksResponse> showBorrowBooks() {
		return memberRepo.findAllBorrowedBooks();
		
	}

}
