package com.fzj.Operation;

import com.fzj.book.BookList;
import com.fzj.book.Books;

import java.awt.print.Book;
import java.util.Scanner;

public class ReturnOperation implements IOperation{


    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        System.out.println("请输入要归还的图书的名称");
        Scanner scan=new Scanner(System.in);
        String name=scan.next();
        for(Books book :bookList.getBooks()){
            if(book.getName().equals(name)){
                if(book.isBorowed()){
                    book.setBorowed(false);
                    System.out.println("归还成功");
                }
                else{
                    System.out.println("该书未被借阅");
                }
                return;
            }
        }
        System.out.println("该书不存在");
    }
}
