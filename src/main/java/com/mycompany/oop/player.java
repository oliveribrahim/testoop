/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author Oliver Ibrahim
 */
public class player {

    int num;
    String name;

    public void setnum(int num) {
        if (num > 0) {
            this.num = num;
        } else {
            System.out.println("invalid number");
        }
    }

    public void setname(String name) {
        if (name.length() > 5) {
            this.name = name;
            System.out.println("the number is " + name);
        } else {
            System.out.println("your name is Less than required");
        }
    }

    public int getnum() {
        return num;
    }

    public String getname() {
        return name;
    }

    public void print() {
        System.out.println( getnum()+ "\nname is : " + getname());
    }   
}
