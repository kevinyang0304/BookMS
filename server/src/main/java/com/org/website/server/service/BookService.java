package com.org.website.server.service;

import com.org.website.server.entity.Book;

import java.util.List;

/**
 * (Book)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 22:29:48
 */
public interface BookService {

    List<Book> getBook(Book book);

    int saveBook(Book book);

    int updateBook(Book book);

    int deleteBook(Book book);
}