package com.example.demo.controller;

import com.example.demo.entity.Books;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookHandler {
    @Autowired //自动装配
    private BookRepository bookRepository;

    @GetMapping("/findAll")
    public List<Books> findAll(String id){
        if (id == "1"){
            return bookRepository.findAll();
        }else{
            return null;
        }
    }
}
