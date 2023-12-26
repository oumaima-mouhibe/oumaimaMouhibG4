package com.example.book.service.mappers;

import com.example.book.dao.entities.Book;
import com.example.book.service.dtos.BookDTO;
import com.example.book.service.dtos.BookDTOInput;
import org.modelmapper.ModelMapper;

public class BookMapper {
    private final ModelMapper modelMapper=new ModelMapper();


    public Book fromBookDtoToBook(BookDTO bookDto) {
        return this.modelMapper.map(bookDto, Book.class);
    }

    public BookDTO fromBookToBookDto(Book book) {
        return this.modelMapper.map(book, BookDTO.class);
    }
    public BookDTO fromBookDtoInputToBookDTO(BookDTOInput bookDTOInput) {
        return this.modelMapper.map(bookDTOInput, BookDTO.class);
    }

    public BookDTOInput fromBookDtoToBookDTOInput(BookDTO bookDTO) {
        return this.modelMapper.map(bookDTO, BookDTOInput.class);
    }

    public Book fromBookDtoInputToBook(BookDTOInput bookDTOInput) {
        return this.modelMapper.map(bookDTOInput, Book.class);
    }
}
