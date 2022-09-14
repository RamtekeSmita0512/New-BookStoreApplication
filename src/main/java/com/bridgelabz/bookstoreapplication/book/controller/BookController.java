package com.bridgelabz.bookstoreapplication.book.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.bookstoreapplication.book.dto.BookDTO;
import com.bridgelabz.bookstoreapplication.book.service.IBookService;
import com.bridgelabz.bookstoreapplication.user.dto.ResponseDTO;

@RestController
public class BookController {
	   @Autowired
	    private IBookService bookService;

	    @GetMapping("/Books")
	    public ResponseEntity<ResponseDTO> getAllBooks() {
	        ResponseDTO responseDTO = bookService.getAllBooks();
	        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	    }

	    @GetMapping("/Books/{id}")
	    public ResponseEntity<ResponseDTO> getBooksById(@PathVariable int id) {
	        ResponseDTO responseDTO = bookService.getBooksById(id);
	        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	    }

	    @PostMapping("/Books")
	    public ResponseEntity<ResponseDTO> creatBooks(@Valid @RequestBody BookDTO bookDTO) {
	        ResponseDTO responseDTO = bookService.creatNewBook(bookDTO);
	        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
	    }

	    @PutMapping("/Books")
	    public ResponseEntity<ResponseDTO> updateBooks(@PathVariable int id, @Valid @RequestBody BookDTO bookDTO) {
	        ResponseDTO responseDTO = bookService.updateBook(id, bookDTO);
	        return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
	    }

	    @DeleteMapping("/Books/{id}")
	    public ResponseEntity<ResponseDTO> deleteBook(@PathVariable int id) {
	        ResponseDTO responseDTO = bookService.deleteBookById(id);
	        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	    }
}
