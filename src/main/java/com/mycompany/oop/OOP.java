/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Oliver Ibrahim
 */
public class OOP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        player p = new player();
        p.setnum(sc.nextInt());
        p.setname(sc.next());
        p.print();
    }
}
