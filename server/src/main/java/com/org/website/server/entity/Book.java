package com.org.website.server.entity;

import java.io.Serializable;
import lombok.Data;
/**
 * (Book)实体类
 *
 * @author makejava
 * @since 2019-07-24 22:31:02
 */
@Data
public class Book implements Serializable {
    private static final long serialVersionUID = -35638499768034586L;
    
    private Integer id;
    
    private Object date;
    
    private String bookName;
    
    private String price;
    
    private String kind;


}