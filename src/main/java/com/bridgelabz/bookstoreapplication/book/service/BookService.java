package com.bridgelabz.bookstoreapplication.book.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.bookstoreapplication.book.dto.BookDTO;
import com.bridgelabz.bookstoreapplication.book.model.Book;
import com.bridgelabz.bookstoreapplication.book.repository.BookRepository;
import com.bridgelabz.bookstoreapplication.user.dto.ResponseDTO;


@Service
public class BookService implements IBookService{
	

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ResponseDTO responseDTO;

   
    public ResponseDTO getAllBooks() {
        return new ResponseDTO("All books get Successfully",bookRepository.findAll());
    }

    
    public ResponseDTO getBooksById(Integer id) {
        return new ResponseDTO("Get book by id",bookRepository.findById(id));
    }

    
    public ResponseDTO creatNewBook(BookDTO bookDTO) {
        Book book = modelMapper.map(bookDTO,Book.class);
        bookRepository.save(book);
        System.out.println(book.toString());
        return new ResponseDTO("Book adding successfully..",book);
    }

    
    public ResponseDTO updateBook(int id, BookDTO bookDTO) {
        Book book = modelMapper.map(bookDTO,Book.class);
        bookRepository.save(book);
        return new ResponseDTO("Update new book",book);
    }


	@Override
	public ResponseDTO deleteBookById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}