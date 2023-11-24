package com.telran.org.lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestStreamAPITwo {
    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Oleg", "Maxim", "Ivan", "Petr");

        Function<String, Student> studentFunction = new Function<String, Student>() { // lambda virajenie for seeing the same as on strings 19-20
            @Override
            public Student apply(String s) {
                return new Student(s);
            }
        };

        //(s,s,s,s) -> (st, st, st, st) here we see map converts from string to a student(object)
        //(s,s,s,s) -. (st, s, i, st) !!! incorrect
        List<Student> studentList = nameList.stream().map(name -> new Student(name)).collect(Collectors.toList());
        System.out.println(studentList);

        List<String> collect = studentList.stream().map(student -> student.getName()).collect(Collectors.toList());
        System.out.println(collect); // pereveli obratno v iz object v string

        List<String> lowerCaseNames = nameList.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
        System.out.println(lowerCaseNames);

        // flatmap - rasvernyt collection
        List<Integer> one = Arrays.asList(1, 2, 3);
        List<Integer> two = Arrays.asList(4, 5, 6);
        List<Integer> three = Arrays.asList(7, 8, 9);

        List<List<Integer>> list = Arrays.asList(one, two, three);
        list.stream().flatMap(x -> x.stream()).map(x -> x * 2).forEach(x -> System.out.print(" " + x)); // from Stream<List<Integer>> to Stream<Integer>

        List<Integer> integerList = list.stream().flatMap(x -> x.stream()).collect(Collectors.toList()); // list of the lists collections
        System.out.println(integerList);
    }
}
