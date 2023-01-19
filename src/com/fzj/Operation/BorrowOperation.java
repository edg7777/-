package com.fzj.Operation;

import com.fzj.book.BookList;
import com.fzj.book.Books;

import java.util.Scanner;

public class BorrowOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍");
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入需要借阅的图书的名称");
        String name=scan.next();
        for(Books book: bookList.getBooks()){
            if(book.getName().equals(name)){
                if(!book.isBorowed()){
                    book.setBorowed(true);
                    System.out.println("图书借阅成功！");
                }
                else{
                    System.out.println("该书已被别人借阅");
                }
                return;
            }
        }
        System.out.println("该书不存在");
    }
}
