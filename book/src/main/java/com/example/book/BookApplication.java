package com.example.book;

import com.example.book.dao.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.print.Book;

@SpringBootApplication
public class BookApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}


	@Autowired
	BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
		Book book = new Book();
		book.setTitle("ppp");
		book.setPublisher("john.doe@example.com");
		book.setdatePublication("28/03/1999");
		book.setPrice("1234");
		book.setResume("12345689");
		bookRepository.save(book);

		Book book1 = new Book();
		book1.setTitle("ooo");
		book1.setPublisher("aaa");
		book1.setdatePublication("28/03/1999");
		book1.setPrice("1234");
		book1.setResume("12345689");
		bookRepository.save(book1);

		Book book2 = new Book();
		book2.setTitle("yyy");
		book2.setPublisher("aaa");
		book2.setdatePublication("28/03/1999");
		book2.setPrice("1234");
		book2.setResume("12345689");
		bookRepository.save(book2);

		Book book3 = new Book();
		book3.setTitle("ttt");
		book3.setPublisher("aaa");
		book3.setdatePublication("28/03/1999");
		book3.setPrice("1234");
		book3.setResume("12345689");
		bookRepository.save(book3);

	}
}
