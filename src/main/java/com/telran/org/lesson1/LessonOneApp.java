package com.telran.org.lesson1;

public class LessonOneApp {
    public static void main(String[] args) {
        Dog shepard = new Dog(); //initialization of variable, type of class = object of class Dog (вызываем method or constructor)
        shepard.setColor("white"); //дали св-во цвета
        shepard.setAge(30); //дали св-во возраста
        shepard.setBreed("shepard"); //дали св-во породы
        Dog angryDog = new Dog(); //reserving name for "angryDog" (marking box of class Dog)
        angryDog.setColor("Black"); //creating собственнре поведение for object
        angryDog.setAge(10); //для установки use Setter
        angryDog.setBreed("yard");//обратились к переменным и дали им значения

        Dog lettleDog = new Dog("little dog", "red"); //when parameters are shown we use this sample
        lettleDog.setAge(5); //установим параметры с/over constructor

        Dog bigDog = new Dog("big dog", "grey", 7, 3);

        System.out.println(shepard);
        System.out.println(angryDog);
        System.out.println(lettleDog);
        System.out.println(bigDog);
        System.out.println("Dog color is " + shepard.getColor()); //без установки модификаторов мы можем вызвать их значение
        System.out.println("Dog age is "+ shepard.getAge());
        System.out.println("Dog breed is " + shepard.getBreed());
    } //для вывода or for reading the variables use Getter
}
