package com.company.test;

import com.company.animal.Animal;
import com.company.animal.Chicken;
import com.company.animal.Tiger;
import com.company.edible.Edible;
import com.company.fruit.Apple;
import com.company.fruit.Fruit;
import com.company.fruit.Orange;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howtoEat());
            }
        }

        Fruit fruits[] = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}
