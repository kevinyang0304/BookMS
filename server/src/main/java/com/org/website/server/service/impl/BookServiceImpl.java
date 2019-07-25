package com.org.website.server.service.impl;

import com.org.website.server.dao.BookDao;
import com.org.website.server.entity.Book;
import com.org.website.server.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Book)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 22:29:48
 */
@Service("bookService")
public class BookServiceImpl implements BookService {
    @Resource
    private BookDao bookDao;

    @Override
    public List<Book> getBook(Book book) {
        return bookDao.selectBook(book);
    }

    @Override
    public int saveBook(Book book) {
        return bookDao.insertBook(book);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public int deleteBook(Book book) {
        return bookDao.deleteBook(book);
    }
}