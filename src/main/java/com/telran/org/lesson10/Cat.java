package com.telran.org.lesson10;

import java.util.Objects;

public class Cat implements Comparable<Cat>{
    private String name;
    private int age;

    public Cat() {
        // empty constructor for creating object and we do not need to create premennie
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) { // method Override cherez Generate
        //1. check that two objects link to one object
        // this. obraschenie k peremenoi a this obraschenie k object
        if(this == obj) { // sravnivaem dve ssilki of an object
            return true;
        }
        //2. check that obk in not null
        if (obj == null) {
            return false;
        }
        //3. check that this and obj is the same class
      //  if (this.getClass() 1= obj.getClass()) // sravnenie ne ychitivaet object of nasledivaniya
        if ((obj instanceof Cat)) { // obj == Cat.class or obj extends Cat.class
        // returns nothing or how teavher did example If (!(obj nstanceof Cat)) { return false: } eto similar
        }else{
            return false;
        }
        // convert varuiable type to class type
        Cat cat = (Cat) obj; // sravnivaem object by field
        // compare by fields
        return Objects.equals(this.name, cat.name) && this.age == cat.age; //kak proisxodit sravnenie of an object stroki sravnivayutsa cheres (EQUAL)
       // for object to be working
    }


//    @Override
//    public boolean equals(Object o) { // if pereopredelyaem method need to pereopredelyat hash code if we use same field in overriden method then use same filed in the hash code
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Cat cat = (Cat) o;
//        return age == cat.age && Objects.equals(name, cat.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return this.age - o.age;
        // or can return this.name.compareTo(o.name); only one principle : or by age : or by name
    }
}
