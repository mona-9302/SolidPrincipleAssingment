package com.example.demo.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Member;
import com.example.demo.request.ShowBorrowedBooksResponse;

public interface IMemberRepo extends JpaRepository<Member, Integer> {

	@Query("SELECT new com.example.demo.request.ShowBorrowedBooksResponse(m.name, m.email, b.title,b.description,b.price,b.id) " +
		       "FROM Member m JOIN m.book b")
 List<ShowBorrowedBooksResponse> findAllBorrowedBooks();
}
