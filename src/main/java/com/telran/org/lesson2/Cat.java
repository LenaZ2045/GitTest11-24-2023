package com.telran.org.lesson2;

public class Cat { // tyt ma pishen logicy
    private String breed; //переменные lowerCamelCase "ageDog"
    private int age;//modification, type, name переменной
    private String color; //важно указывать модификатор поле "private" переменной ("private"-сокрытие/защита данных)
    private int weight; //modification "private" type "int" name "weight"

    public Cat(int age) {
        this.age = age;
    }

    public void voice() {
        System.out.println("Meow!");
    }

    public Cat() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
