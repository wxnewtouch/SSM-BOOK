package com.ssm.service;

import com.ssm.pojo.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    /**
     * 根据主键查找记录数据
     * @param id
     * @return
     */
    public Book queryById(@Param("id") long id);

    /**
     * 查询所有记录
     * @param offset 这个目前还不知道
     * @param limit 这个是限制条数
     * @return 返回值
     */
    public List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 新增数据
     * @param book
     */
    public void insertBook(Book book);

    /**
     * 更新记录
     * @param book
     */
    public void updateBook(Book book);

    /**
     * 根据主键删除记录
     * @param id
     */
    public void deleteBook(long id);
    /**
     * 查找数据库中总共有多少本书
     */
    public int countNum();
}
