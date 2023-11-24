package com.telran.org.lesson6;

import com.telran.org.lesson6.hwreview.CreditCard;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // created object of Array list (realizes dynamic place for memory) created on array base
        list.add(2); // imeet poryadok indexa NEXT elements will add at the end of index that stays before
        list.add(3);
        list.add(5);
        list.add(10);
        System.out.println(list);
        System.out.println("first Size of list = " + list.size()); // size() - real size of list
        list.add(1,6); // index, element - inserts element to certain place
        System.out.println(list);
        System.out.println(" after add Size of list = " + list.size()); // size() - real size of list
        System.out.println(list.get(1)); // polychenie method by index get()
        list.remove(1); // method delete by index
        System.out.println(list); // element list after
        list.remove(Integer.valueOf(5)); // delete object
        System.out.println(list);

        for (int i=0; i< list.size(); i++) { // cycle with schetchik
            System.out.println("element of index " + i + " = " + list.get(i));
        }

        for (Integer element : list) { // for each to read index of element is not available
            System.out.println("element = "+ element);
        }


        List<Integer> list2 = new ArrayList<>(); // esli write List legko chto pomenyat professional creation of object
        List<Integer> list3 = new LinkedList<>(); // podmena reralizatcii LIST interface of Array List which is abstract List implements ...

        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("World");
        System.out.println(stringList);
        stringList.remove("Hello");
        System.out.println(stringList);

        CreditCard cardOne = new CreditCard(1000, "USD");
        CreditCard cardTwo = new CreditCard(2000, "USD");
        List<CreditCard> creditCardList = new ArrayList<>();
        creditCardList.add(cardOne); // creditCardList.add(new CreditCardOne(1000);
        creditCardList.add(cardTwo); // creditCardList.add(new CreditCardTwo(2000);
        System.out.println(creditCardList);


    }
}
