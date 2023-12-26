package com.example.book.service;

import com.example.book.BookApplication;
import com.example.book.service.dtos.BookDTO;

public interface BookManager {
    //public static BookDTO getBookById(Float id);

    public BookDTO getBookByTitle();

    public  BookDTO getBookByPublisheramdPrice(String publisher, Float price);
    public  BookDTO saveBook(BookDTO bookdto);
    public BookDTO deleteBook(Float id);

}
