package com.org.website.server.dao;

import com.org.website.server.entity.Book;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * (Book)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-24 22:45:51
 */
public interface BookDao extends BaseMapper<Book>{

    List<Book> selectBook(@Param("book") Book book);

    int insertBook(@Param("book") Book book);

    int updateBook(@Param("book") Book book);

    int deleteBook(@Param("book") Book book);
}