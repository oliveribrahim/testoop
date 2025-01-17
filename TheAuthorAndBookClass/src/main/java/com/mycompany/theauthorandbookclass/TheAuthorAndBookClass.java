/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.theauthorandbookclass;

import java.util.Scanner;

/**
 *
 * @author Oliver Ibrahim
 */
public class TheAuthorAndBookClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Author a1 = new Author("Oliver", "Oliver@gmail.com", 'm');
        System.out.println("The name is : "+a1.getName()+"\nthe email is : "+ a1.getEmail()+"\nthe gender is : "+a1.getGender());
        
        Book b1 = new Book("Java", new Author("oliver", "BOTROS@gmail.com", 'M'), 150, 12);
        Book b2 = new Book("Data Science", new Author("Engy", "BOTROS@gmail.com", 'F'), 200, 15);
        Book b3 = new Book("Embededd", new Author("botros", "BOTROS@gmail.com", 'M'), 200, 15);
        System.out.println("The name of Book : " + b1.getName()
                + "\nthe data of author is : " + b1.getAuthor()
                +"\nthe price is : "+b1.getPrice()
                +"\nthe quantity in the stock is : "+b1.getQtinStock()
        );
        
        

    }
}
