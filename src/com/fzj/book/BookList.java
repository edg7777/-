package com.fzj.book;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Books> books=new ArrayList<>();//书的集合
    private int numOfbook;

    public BookList() {
        books.add(new Books("白夜行","东野圭吾",48,"故事"));
        books.add(new Books("星辰变","西红柿",28,"玄幻"));
        this.numOfbook=2;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    public void setNumOfbook(int numOfbook) {
        this.numOfbook = numOfbook;
    }

    public List<Books> getBooks() {
        return books;
    }

    public int getNumOfbook() {
        return numOfbook;
    }
}
