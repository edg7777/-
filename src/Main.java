import com.fzj.Operation.*;
import com.fzj.Uesr.Admin;
import com.fzj.Uesr.Normal;
import com.fzj.book.BookList;
import jdk.nashorn.internal.ir.ReturnNode;

import java.awt.print.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        BookList bookList=new BookList();
        boolean flag=true;
        int op;
        System.out.println("请输入您的姓名：");
        Scanner scan=new Scanner(System.in);
        String n=scan.next();
        System.out.println("请输入您的身份: 1->管理员  0->普通用户");
        int identity=scan.nextInt();
        if(identity==1){
            while(flag){
                Admin admin=new Admin(n);
                op=scan.nextInt();
                if(op==1){
                    FindOperation findOperation=new FindOperation();
                    findOperation.work(bookList);
                }
                else if(op==2){
                    AddOperation addOperation=new AddOperation();
                    addOperation.work(bookList);
                }
                else if(op==3){
                    DelOperation delOperation=new DelOperation();
                    delOperation.work(bookList);
                }
                else if(op==4){
                    DisplayOperation displayOperation=new DisplayOperation();
                    displayOperation.work(bookList);
                }
                else if(op==0){
                    flag=false;
                }
            }
        }
        else if(identity==0){
            while(flag){
                Normal normal=new Normal(n);
                op=scan.nextInt();
                if(op==1){
                    FindOperation findOperation=new FindOperation();
                    findOperation.work(bookList);
                }
                else if(op==2){
                    BorrowOperation borrowOperation=new BorrowOperation();
                    borrowOperation.work(bookList);
                }
                else if(op==3){
                    ReturnOperation returnOperation=new ReturnOperation();
                    returnOperation.work(bookList);
                }
                else if(op==0){
                    flag=false;
                }
            }
        }
    }
}