package com.ssm.dao;

import com.ssm.pojo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class BookMapperTest {
    @Autowired
    private BookMapper bookMapper;
//    @Test
//    public void insert(){
//        Book book = new Book();
//        book.setBookId(2l);
//        book.setName("王新");
//        book.setNumber(123);
//        book.setDetail("王新");
//        bookMapper.insertBook(book);
//    }
}