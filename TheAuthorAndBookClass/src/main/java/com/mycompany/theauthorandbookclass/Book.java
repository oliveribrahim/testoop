/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.theauthorandbookclass;

/**
 *
 * @author Oliver Ibrahim
 */
public class Book {
    
    private String name;
    private Author author;
    private double price;
    private int qtinStock;

    public Book() {
    }

    public Book(String name, Author author, double price, int qtinStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtinStock = qtinStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtinStock() {
        return qtinStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtinStock(int qtinStock) {
        this.qtinStock = qtinStock;
    }
    
    @Override
    public String toString()
    {
        return name + " by "+author.toString();
    }
    
    
}
