package com.ssm.service.serviceImpl;

import com.ssm.dao.BookMapper;
import com.ssm.pojo.Book;
import com.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Book queryById(long id) {
        return bookMapper.queryById(id);
    }

    @Override
    public List<Book> queryAll(int offset, int limit) {
        return bookMapper.queryAll(offset,limit);
    }

    @Override
    public void insertBook(Book book) {
        bookMapper.insertBook(book);
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }

    @Override
    public void deleteBook(long id) {
        bookMapper.deleteBook(id);
    }

    @Override
    public int countNum() {
        return bookMapper.countNum();
    }
}
