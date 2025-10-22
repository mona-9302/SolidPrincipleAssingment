package com.example.demo.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.entity.Author;

public interface IAuthorRepo extends JpaRepository<Author, Integer> {

	@Query("Select a.name from Author a where a.id IN :ids")
	public List<String> findByauthorName(@Param("ids")List<Integer>ids);

	@Query("SELECT a.name FROM Books b JOIN b.author a WHERE b.id = :bookId")
	List<String> findAuthorNameFromBooks(@Param("bookId") Integer bookId);
	
//	@Query("SELECT a.id FROM Books b JOIN b.author a WHERE b.id = :bookId")
//	List<Integer> findAuthorById(@Param("bookId")Integer  bookId);
}
