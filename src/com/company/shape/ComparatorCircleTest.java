package com.company.shape;

import java.util.Arrays;

public class ComparatorCircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.7, "blue", true);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        ComparatorCircle comparatorCircle = new ComparatorCircle();
        Arrays.sort(circles, comparatorCircle);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
