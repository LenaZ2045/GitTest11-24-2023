package com.telran.org.lesson2;

import com.telran.org.lesson1.Dog;

public class LessonTwoApp { // zdes isponyaetsa nasha logica
    public static void main(String[] args) {
        Cat cat = new Cat(15); // main class we initialized
        cat.voice();
        cat.setColor("Red");

        WildCat wildCat = new WildCat(11, "Stripes"); // class with inheritance follow similar meaning
        wildCat.voice();
        wildCat.setSpecification("predator");
        wildCat.setColor("White");

        Dog dog = new Dog(); // importing class form different package
        com.telran.org.lesson2.Dog dog1 = new com.telran.org.lesson2.Dog(); // can create two same name classes but need full put do classa

        LittleCat littleCat = new LittleCat();
        littleCat.voice();
        littleCat.jump(); // edded new action for little cat
        littleCat.setColor("Black");

        LittleCat littleCat1 = new LittleCat();
        littleCat1.voice();
        littleCat1.setColor("Yellow");

        SeaCat seaCat = new SeaCat(25);
        seaCat.voice();
        seaCat.setHeight(20);
        seaCat.swim();
        seaCat.setColor("Grey");


        System.out.println("Cat's color: " + cat.getColor());
        System.out.println("Wild cat's color: " + wildCat.getColor());
        System.out.println("Little cat's color: " + littleCat.getColor());
        System.out.println("Little cat's 1 color: " + littleCat1.getColor());
        System.out.println("Sea cat's color: " + seaCat.getColor());

    }
}
