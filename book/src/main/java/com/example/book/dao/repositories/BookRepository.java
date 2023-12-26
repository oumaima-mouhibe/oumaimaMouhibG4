package com.example.book.dao.repositories;

import com.example.book.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Float> {
    Book findByTitle(String title);
    Book findByPublisherandPrice(String publisher,Float price);

    Book delete(Optional<Book> id);

    Optional<Book> findById(Float id);

}
