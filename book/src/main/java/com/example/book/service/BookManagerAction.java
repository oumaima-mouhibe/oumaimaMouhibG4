package com.example.book.service;

import com.example.book.dao.entities.Book;
import com.example.book.dao.repositories.BookRepository;
import com.example.book.service.dtos.BookDTO;
import com.example.book.service.dtos.BookDTOInput;
import com.example.book.service.mappers.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BookManagerAction implements BookManager{
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookMapper bookMapper;

    @Override
    public BookDTO getBookBytitle(String title) {
        return bookMapper.fromBookToBookDto(bookRepository.findByTitle(title));
    }

    @Override
    public BookDTO findByPublisherandPrice(String publisher,Float price) {
        return bookMapper.fromBookToBookDto(bookRepository.findByPublisherandPrice(publisher,price));
    }

    @Override
    public BookDTO saveBook(BookDTOInput bookDTOInput) {
        Book book = bookMapper.fromBookDtoInputToBook(bookDTOInput);
        book = bookRepository.save(book);
        return bookMapper.fromBookToBookDto(book);
    }

    @Override
    public BookDTO deleteBook(Optional<Book> id) {
        return bookMapper.fromBookToBookDto(bookRepository.delete(bookRepository.findById(id)));
    }
}
