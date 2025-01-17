/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.circleclass;

/**
 *
 * @author Oliver Ibrahim
 */
public class Circle {
    private double radius;
    private String Color;
    public Circle()
    {
     this.radius = 1.0;
     this.Color = "Red";
    }
    public Circle(double r)
    {
       radius = r;
    }

    public Circle(double radius, String Color) {
        this.radius = radius;
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", Color=" + Color + '}';
    }
    
    
    public double getRedius()
    {
        return radius;
    }

    public String getColor() {
        return Color;
    }
    
    
    public  double getArea()
    {
        return Math.PI*radius*radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    
}
