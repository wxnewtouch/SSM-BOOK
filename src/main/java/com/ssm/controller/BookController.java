package com.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.ssm.pojo.Book;
import com.ssm.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@Controller
@RequestMapping("/book")
public class BookController {
//    记录日志
    /**
     *
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());
//    注入service层
    /**
     *
     *
     */
    @Autowired
    private BookService bookService;

    /**
     * 查询全部
     * @param model
     * @return
     */
    @RequestMapping(value = "/list", method= RequestMethod.GET)
    public String list(Model model){
        List<Book> list = bookService.queryAll(0,10);
        model.addAttribute("list",list);
        return "list";
    }

    /**
     * 添加
     * @param book
     * @return
     */
    @RequestMapping(value = "/insertBook",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String insertBook(Book book){
        Book hasBook = bookService.queryById(book.getBookId());
        System.out.println(hasBook);
        if (hasBook == null){
            bookService.insertBook(book);
        }else {
            return "error";
        }
       return "success";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteBook/{bookId}",method = RequestMethod.GET)
    @ResponseBody
    public String deleteBook(@PathVariable("bookId") long id){
        Book hashBook = bookService.queryById(id);
        if (hashBook == null){
            logger.info("没有这条记录");
            return "error";
        }else{
            bookService.deleteBook(id);
        }
        return "redirect:/book/list";
    }

    @RequestMapping(value = "/detail/{bookId}",method = RequestMethod.GET)
    public String queryById(@PathVariable("bookId") long id,Model model){
        Book hasbook = bookService.queryById(id);
        model.addAttribute("book",hasbook);
        return "detail";
    }

    /**
     * 计算总页数
     */
    @RequestMapping(value = "/countNum",method = RequestMethod.GET,produces = {"application/json; charset=utf-8"})
    @ResponseBody
    public int getPage(){
        int num =  bookService.countNum();
//        计算页数，如果除以10有余数，要加上一页
        int countNum = num / 10 + ((num%10) > 0?1:0);
        return countNum;
    }

    /**
     * 分页查询方法
     * @param start
     * @return
     */
    @RequestMapping(value = "/listPage",method = RequestMethod.POST)
    @ResponseBody
    public String listPage(@RequestParam("start") int start){
        List<Book> bookList = bookService.queryAll(start,10);
        String s = JSON.toJSONString(bookList);
        return s;
    }
}
