package com.org.website.server.service.impl;

import com.org.website.server.bean.Book;
import com.org.website.server.mapper.BookMapper;
import com.org.website.server.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookMapper bookMapper;

    @Override
    public void saveBookInfo(Book book) {

        bookMapper.insert(book);
    }

    @Override
    public void delBookInfo(Book book) {
        bookMapper.deleteById(book.getId());
    }

    @Override
    public void updateBookInfo(Book book) {
        bookMapper.updateById(book);
    }

    @Override
    public List<Book> getBooksInfo() {
        List<Book> bookList = bookMapper.selectList(null);
        System.out.println("getBooksInfo");
        return bookList;
    }
}
