package com.telran.org.lesson10;

public class Person { // to compare class-object Person we created separate class which sorts by age and other class which sorts by name with implement of Comparator interface of class-object <Person>
    private  String name; //object-Person's field 1 is the name
    private  int age; //object-Person's field 2 is age

    public Person(String name, int age) { // constructor
        this.name = name;
        this.age = age;
    }

    public String getName() { //getter for Name
        return name;
    }

    public void setName(String name) { // setter for Name
        this.name = name;
    }

    public int getAge() { // getter for Age
        return age;
    }

    public void setAge(int age) { // setter for Age
        this.age = age;
    }

    @Override
    public String toString() { // override methods to String to make hash code or hash number not to be display in console
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
