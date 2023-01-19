package com.fzj.Uesr;

public class Admin extends User{

    public Admin(String name) {
        super(name);
        System.out.println("========================================");
        System.out.println("尊贵的管理员-"+this.name+"，欢迎使用本图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示所有图书");
        System.out.println("0.退出系统");
        System.out.println("========================================");
        System.out.print("请输入数字以使用相应的功能：");
    }

}
