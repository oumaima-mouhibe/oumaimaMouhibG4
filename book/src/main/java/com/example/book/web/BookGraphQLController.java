package com.example.book.web;

import com.example.book.service.BookManager;
import com.example.book.service.dtos.BookDTO;
import com.example.book.service.dtos.BookDTOInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookGraphQLController {
@Autowired
private BookManager bookManager;
    private Object BookDTOInput;

    @QueryMapping
    public BookManager getBookByTitle(@Argument String title){
        return bookManager.getBookByTitle(title);
    }
    @QueryMapping
    public BookDTO getByPublisherandPrice(@Argument String publisher, @Argument Float price){
        return bookManager.getBookByPublisheramdPrice(publisher, price);
    }
    @MutationMapping
    public BookDTO saveBook(@Argument BookDTO bookDTO){
        return bookManager.saveBook(BookDTO);

    }







}
