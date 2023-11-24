package com.telran.org.lesson2;

public class Hippodrome {
    public static void main(String[] args) {
       Cat catOne = new Cat(15);
        Cat catTwo = new Cat(10);
        Cat catThree = new Cat(5);
        WildCat wildCat = new WildCat(20, "Tiger");
        SeaCat seaCat = new SeaCat(9);

        Cat[] cats = {catOne, catTwo, catThree, wildCat, seaCat};
       run(cats); // mojno pisat catOne, catTwo, wildCat
    }
    private static void run(Cat[] cats) { // mojno pisat Cat...cats for masssive
        for (Cat cat : cats) {
            cat.voice();
        }
    }
}
