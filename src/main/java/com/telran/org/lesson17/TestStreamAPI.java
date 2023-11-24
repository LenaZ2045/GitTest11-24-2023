package com.telran.org.lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestStreamAPI {
    public static  void main(String[] args) {
        //Collection.stream().Intermediate().Intermediate().Intermediate()......Terminal();
        // Intermediate
        // 1. filter(Predicate) - filter by true
        // 2. sorted() - sort elements
        // 3. limit() - limit of elements
        // 4. skip() - skip of elements
        // 5 distinct() - unique element will remove double elements
        // 6. peek(consumer) - choose one element by the odd or even or what you write in the operation/command ( make action for each element)
        // 7 map(Function) - converts elements into different structure or type of data
        // 8. flatmap - unpack collection and convert it

        // Terminal
        // 1. count() - count of elements in stream
        // 2. collect() (Collectors.toList())- collecting
        // 3. foreach(consumer) - make action for each element
        List<Integer> integerList = Arrays.asList(3, 8, 5, 3, 1, 6, 7, 4);
        // integerList.stream()
        int count = 0;
        for (Integer value : integerList) {
            if (value % 2 != 0) {
                count++;
            }
        }
        System.out.println("Count " + count);

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 != 0;
            }
        };

        // filter, count
        long result = integerList.stream().filter(integer -> integer % 2 != 0).count();
        // sorted, collect
        List<Integer> collect = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println("Unsorted " + integerList);
        System.out.println("Sorted " + collect);
        //sorted & limited
        List<Integer> resLimit = integerList.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println("Sorted and limited " + resLimit);
        // sorted & skip
        List<Integer> resSkip = integerList.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println("Sorted ad skip " + resSkip);

        //distinct
        List<Integer> distinct = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct collection " + distinct);

        // foreach( prinimaet Consumer)
        integerList.stream().forEach(integer -> System.out.println(" " + integer));

        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(" " + integer);
            }
        };

        // peek(Consumer) posle etogo mojno esche otsortirovat i vivesti ego kolektciyu
        List<Integer> evenSortedList = integerList.stream().filter(element -> element % 2 == 0).peek(integer -> System.out.print(" " + integer)).sorted().collect(Collectors.toList());

        integerList.forEach(integer -> {
            //konechniy method
        }); // instead to write full cycle 'for' will use shorter version in Java library
//        integerList.stream().sorted()forEach(integer -> {
//            System.out.println(" " + integer);
//            System.out.println();
//        });
    }

    private long getCountOddElements(List<Integer> list) {
        return list.stream().filter(integer -> integer % 2 !=0).count();
    }
}
