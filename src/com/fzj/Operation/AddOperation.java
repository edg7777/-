package com.fzj.Operation;

import com.fzj.book.BookList;
import com.fzj.book.Books;

import java.util.Scanner;

public class AddOperation implements IOperation{


    @Override
    public void work(BookList bookList) {
        System.out.println("添加图书");
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name=scan.next();
        System.out.println("请输入图书的作者");
        String author=scan.next();
        System.out.println("请输入图书的价格");
        double price =scan.nextInt();
        System.out.println("请输入图书的类型");
        String type=scan.next();
        Books newbook=new Books(name,author,price,type);
        bookList.getBooks().add(newbook);
        int cnt= bookList.getNumOfbook();
        bookList.setNumOfbook(cnt++);
        System.out.println("图书添加成功");
    }
}
