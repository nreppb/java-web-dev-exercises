package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double pi = 3.14;

        System.out.println("What is the radius of your circle?");
        Double radius = input.nextDouble();
        Double area = Circle.getArea(radius);
        System.out.println("The area of your circle with radius " + radius + " is: " + area);
    }
}
