package com.example.book.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private String title;
    private String publisher;
    private Date datePublication;
    private Long price;
    private  String resume;
}
