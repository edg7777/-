package com.fzj.Operation;

import com.fzj.book.BookList;
import com.fzj.book.Books;

import java.util.Scanner;

public class FindOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        System.out.println("请输入书的名称");
        Scanner scan=new Scanner(System.in);
        String name=scan.next();
        for(Books book : bookList.getBooks()){
            if(book.getName().equals(name)){
                System.out.println("找到该图书");
                System.out.println(book.toString());
                return;
            }
        }
        System.out.println("没有找到该图书");

    }
}
