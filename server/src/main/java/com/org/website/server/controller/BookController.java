package com.org.website.server.controller;

import com.org.website.server.entity.Book;
import com.org.website.server.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Book)表控制层
 *
 * @author makejava
 * @since 2019-07-24 22:29:48
 */
@RestController
@RequestMapping("book")
public class BookController {
    /**
     * 服务对象
     */
    @Resource
    private BookService bookService;

    @PostMapping("getBook")
    List<Book> getBook(@RequestBody Book book){
        return bookService.getBook(book);
    }

    @PostMapping("saveBook")
    int saveBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @PostMapping("updateBook")
    int updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @PostMapping("deleteBook")
    int deleteBook(@RequestBody Book book){
        return bookService.deleteBook(book);
    }
}