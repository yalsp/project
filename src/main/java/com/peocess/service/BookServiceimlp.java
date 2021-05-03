package com.peocess.service;

import com.peocess.dao.BookRepository;
import com.peocess.demo.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceimlp implements BookService {
    @Autowired
    public BookRepository  bookRepository;

    /**
     * 增添
     * @param bookname
     * @return
     */
    @Override
    public String addbook( String bookname) {
        BookEntity book =new BookEntity();
        book=bookRepository.findTopByBookname(bookname);
        if(book.getBookname()!=null)
        {
            bookRepository.save(book);
            return "添加成功";
        }
        else{
            return "添加失败";
        }
    }


    /**
     * 修改
     * @param book
     * @return
     */
    @Override
    public String update(BookEntity book) {
        List<Object> list = new ArrayList<Object>();
        list.add(book.getId());
        list.add(book.getBookname());
        if(book.getBookname()!=null){
            return book.getBookname();
        }
        else{
         return "修改失败";
        }
    }

    /**
     * 查找
     * @param book
     * @return
     */
    @Override
    public String findbook(BookEntity book) {
        if(bookRepository.existsById(book.getId()))
        {
            return "书名是："+book.getBookname()+"  "+"编号是： "+book.getId();
        }
        else {
            return "id不存在";
        }
    }

    /**
     * 删除
     * @param book
     * @return
     */
    @Override
    public String deletebook(BookEntity book) {
        if(bookRepository.existsById(book.getId()))
        {
        bookRepository.deleteById(book.getId());
             if(bookRepository.existsById(book.getId())){
                 return "删除失败";
             }
             else{
                 return "删除成功";
             }
        }
        else {
            return "id不存在";
        }

    }

}
