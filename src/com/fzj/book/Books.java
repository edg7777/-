package com.fzj.book;

public class Books {
    private String name;
    private String author;
    private double price;
    private String type;
    private boolean isBorowed;

    public Books(String name, String author, double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBorowed(boolean borowed) {
        isBorowed = borowed;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public boolean isBorowed() {
        return isBorowed;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorowed=" + isBorowed +
                '}';
    }
}
