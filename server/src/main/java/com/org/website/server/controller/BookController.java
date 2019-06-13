package com.org.website.server.controller;

import com.org.website.server.bean.Book;
import com.org.website.server.service.BookService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/bookop")
@CrossOrigin(origins = "http://localhost:8082",allowCredentials = "true")
public class BookController {

    @Resource
    private BookService bookService;

    //获取所有书籍信息
    @RequestMapping("/getBooksInfo")
    public List<Book> getBooksInfo(){
        List<Book> bookList = bookService.getBooksInfo();

        return bookList;
    }

    //保存书籍信息接口
    @RequestMapping("/saveBookInfo")
    public void saveBookInfo(@RequestParam(value = "date") String date,
                             @RequestParam(value = "bookName") String bookName,
                             @RequestParam(value = "price") String price,
                             @RequestParam(value = "kind") String kind){

        Book book = new Book();
        book.setDate(date);
        book.setBookName(bookName);
        book.setPrice(price);
        book.setKind(kind);
        bookService.saveBookInfo(book);
    }

    //删除书籍信息接口
    @RequestMapping("/delBookInfo")
    public void delBookInfo(@RequestParam(value = "id") String id){

        Book book = new Book();
        book.setId(Integer.parseInt(id));
        bookService.delBookInfo(book);
        System.out.println("delBookInfo");
    }

    //更新书籍信息接口
    @RequestMapping("/updateBookInfo")
    public void updateBookInfo(@RequestParam(value = "id") String id,
                             @RequestParam(value = "date") String date,
                             @RequestParam(value = "bookName") String bookName,
                             @RequestParam(value = "price") String price,
                             @RequestParam(value = "kind") String kind) {

        Book book = new Book();
        book.setId(Integer.parseInt(id));
        book.setDate(date);
        book.setBookName(bookName);
        book.setPrice(price);
        book.setKind(kind);
        bookService.updateBookInfo(book);
        System.out.println("updateBookInfo");
    }
}
