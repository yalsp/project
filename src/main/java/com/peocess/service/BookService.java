package com.peocess.service;
import com.peocess.demo.BookEntity;

public interface BookService {

    String addbook (String bookname);

    String update (BookEntity book);

    String findbook(BookEntity book);

    String deletebook(BookEntity book);
}
