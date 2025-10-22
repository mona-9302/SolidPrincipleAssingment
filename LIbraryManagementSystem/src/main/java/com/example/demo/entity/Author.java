package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "author_tab")
public class Author {
     
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 
	 @Column(name = "author_name")
	 private String name;
	 
	 @Column(name = "author_email")
	 private String email;
	 
	 @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
	 private List<Books> books;
	 
	 public Author(String name,String email) {
		 this.name = name;
		 this.email = email;
	 }


}
