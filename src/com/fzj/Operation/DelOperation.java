package com.fzj.Operation;

import com.fzj.book.BookList;
import com.fzj.book.Books;

import java.util.Scanner;

public class DelOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        System.out.println("请输入删除的图书名称");
        Scanner scan=new Scanner(System.in);
        String name=scan.next();
        int cnt=bookList.getNumOfbook();
        for(Books book :bookList.getBooks()){
            if(book.getName().equals(name)){
                bookList.getBooks().remove(book);
                bookList.setNumOfbook(cnt--);
                System.out.println("图书删除成功");
                return;
            }
        }
        System.out.println("没有找到你想要删除的图书");
    }
}
