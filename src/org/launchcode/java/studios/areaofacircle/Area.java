package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Double r;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        try {
            r = in.nextDouble();
            if (r < 0) {
                System.out.println("ERROR: Radius must be a positive number.");
            } else {
                System.out.println(Circle.getArea(r));
            }
        } catch(Exception e) {
            System.out.println("ERROR: Invalid input.");
        }
    }
}
