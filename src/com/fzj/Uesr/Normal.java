package com.fzj.Uesr;

public class Normal extends User{
    public Normal(String name) {
        super(name);
        System.out.println("========================================");
        System.out.println("尊贵的用户-"+this.name+"，欢迎使用本图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("========================================");
        System.out.print("请输入数字以使用相应的功能：");
    }
}
