package com.fzj.Operation;

import com.fzj.book.BookList;
import com.fzj.book.Books;

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示书籍");
        for(Books book :bookList.getBooks()){
            System.out.println(book.toString());
        }
    }
}
