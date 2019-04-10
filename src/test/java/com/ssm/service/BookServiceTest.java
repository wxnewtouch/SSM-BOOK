package com.ssm.service;


import com.ssm.pojo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class BookServiceTest {
    @Autowired
    private BookService bookService;
//    @Test
//    public void insert(){
//        Book book = new Book();
//        book.setBookId(3l);
//        book.setName("王新");
//        book.setNumber(123);
//        book.setDetail("王新");
//        bookService.insertBook(book);
//    }
}