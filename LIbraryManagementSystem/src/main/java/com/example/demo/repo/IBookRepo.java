package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.entity.Books;

public interface IBookRepo extends JpaRepository<Books, Integer> {
    
	@Modifying
	@Query("UPDATE Books b SET b.stock = b.stock - 1 WHERE b.id = :bookId AND b.stock > 0")
	int decreaseBookStock(Integer bookId);

	@Modifying
	@Query("Update Books b Set b.stock=b.stock + 1 where b.id = :bookId And b.stock > 0")
	int returnBookByMember(Integer bookId);

}
