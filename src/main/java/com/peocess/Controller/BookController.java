package com.peocess.Controller;

import com.peocess.demo.BookEntity;
import com.peocess.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value="book")
@RestController

public class BookController {
    @Autowired
    public BookService bookService;


    @GetMapping(value = "delete")
    public ResponseEntity<Void> delete(@RequestBody BookEntity book){
        bookService.deletebook(book);
        return ResponseEntity.ok().build();
    }


    @PostMapping(value = "add")
    public ResponseEntity<Void> add(@RequestParam  String bookname){
        bookService.addbook(bookname);
        return ResponseEntity.ok().build();

    }


    @GetMapping(value = "find")
    public ResponseEntity<Void> find(@RequestBody BookEntity book){
        bookService.findbook(book);
        return ResponseEntity.ok().build();
    }



    @GetMapping(value = "update")
    public ResponseEntity<Void> updatebook(@RequestBody BookEntity book){
        bookService.update(book);
        return ResponseEntity.ok().build();
    }


}
