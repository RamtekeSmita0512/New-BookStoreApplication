package com.bridgelabz.bookstoreapplication.book.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.bridgelabz.bookstoreapplication.user.model.Cart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int bookId;

	    private String bookName;
	    private String bookAuthor;
//	    private String bookDescription;
//	    private String bookLogo;
	    private int bookPrice;
	    private int bookQuantity;

	    
	    @ManyToOne(cascade = CascadeType.ALL )
	    private Cart cart;
}
