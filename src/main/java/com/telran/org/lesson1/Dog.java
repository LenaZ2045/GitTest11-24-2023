package com.telran.org.lesson1;
//название всех классов с большой буквы и если 2 слова у класса имени то пишем в style camel "SuperDog"
public class Dog { //шаблон и описание собаки 4 свойства (class is шаблон or эскиз)
    //modification "public" name "Dog"
    private String breed; //переменные lowerCamelCase "ageDog"
    private int age;//modification, type, name переменной
    private String color; //важно указывать модификатор поле "private" переменной ("private"-сокрытие/защита данных)
    private int weight; //modification "private" type "int" name "weight"

    public Dog() { //name same as class Method in constructor по умолчанию Class should have constructor
        System.out.println("Hello! constructor without parameters");
    } //method in constructor if not created то он компилируется automatically

    public Dog(String breed, String color) { //constructor contains two parameters (Constructor вызывает object of created class)
        System.out.println("Hello! constructor with parameters");
        this.breed = breed;
        this.color = color;
    } //we may create method with same name "Dog" but should change it including different parameters

    public Dog(String breed, String color, int age, int weight) {
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    //for to give access to "private" we create methods getter and setter
    public void setColor(String color) { //principle for инкапсуляции
        this.color = color;
    }

    public String getColor() { //methods getter and setter lets you work with variable-переменной
        return color;
    }

    public String getBreed() {
        return breed;
    } //method getter

    public void setBreed(String breed) { //method setter
        this.breed = breed;
    }

    public int getAge() { //method getter
        return age;
    }

    public void setAge(int age) { //method setter
        if (age < 0) {
            return;
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight + //inserted "weight" when regenerated
                '}';
    }
}
