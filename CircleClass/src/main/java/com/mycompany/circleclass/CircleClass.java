/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.circleclass;

import java.util.Scanner;

/**
 *
 * @author Oliver Ibrahim
 */
public class CircleClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        Circle c1 = new Circle();
        System.out.println("Redius of the Circle is " + c1.getRedius() + "\nArea of the Circle is " + c1.getArea());

        Circle c2 = new Circle(r);
        System.out.println("\nRedius of the Circle is " + c2.getRedius() + "\nArea of the Circle is " + c2.getArea());

        Circle c3 = new Circle(r, "Black");
        System.out.println("\nRedius of the Circle is " + c2.getRedius()
                + "\nArea of the Circle is " + c2.getArea()
                + "\n" + c3.toString());

    }
}
