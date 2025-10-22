package com.example.demo.entity;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book_tab")
public class Books {
     
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 
	 @Column(name = "book_title")
	 private String title;
	 
	 @Column(name = "book_desc")
	 private String description;
	 
	 @Column(name = "book_price")
	 private Integer price;
	 
	 @Column(name = "book_stock")
	 private Integer stock;
	 
	 @ManyToMany
	 @JoinTable(name = "books_member",
	 joinColumns = @JoinColumn(name = "book_id"),inverseJoinColumns=@JoinColumn(
			 name = "member_id"))
	 private List<Member> members;
	 
	 @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	 @JoinColumn(name = "author_id")
	 private Author author;
}
