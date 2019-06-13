package com.org.website.server.service;

import com.org.website.server.bean.Book;

import java.util.List;

public interface BookService {
    public void saveBookInfo(Book book);

    public void delBookInfo(Book book);

    public void updateBookInfo(Book book);

    public List<Book> getBooksInfo();
}
