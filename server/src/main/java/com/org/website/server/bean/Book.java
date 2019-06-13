package com.org.website.server.bean;

import lombok.Data;

@Data
public class Book {
    private int id;
    private String date;
    private String bookName;
    private String price;
    private String kind;
}
