package com.company.shape1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1.0);
        shapes[1] = new Rectangle(1, 1);
        shapes[2] = new Square(1);

        System.out.println("Area before resize:");

        for (Shape element : shapes
        ) {
            System.out.println(element.getArea());
        }

        for (Shape element : shapes
        ) {
            element.resize(random.nextDouble()*100);
        }

        System.out.println("Area after resize:");

        for (Shape element : shapes
        ) {
            if(element instanceof Colorable){((Colorable) element).howToColor();}
            System.out.println(element.getArea());
        }

    }
}
