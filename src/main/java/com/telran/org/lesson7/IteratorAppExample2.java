package com.telran.org.lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorAppExample2 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i);
        }
        System.out.println(integerList);

//        for(Integer e : integerList) {
//            if(e % 2 !=0) {
//                integerList.remove(e); // delete collection mot possible this way
//            }
//        }

//        for( int i = 0; i< integerList.size(); i++ ) { // cycle with indexes
//            if (integerList.get(i) % 2 != 0) {
//                integerList.remove(i); // this cycle works instead of cycle above
//            }
//        }
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) { // method hasNext
            Integer element = iterator.next();
            if (element % 2 != 0) {
                System.out.print(element + " ");
                iterator.remove(); // method remove which is already is in Java catalog
            }
        }
        System.out.println();
        System.out.println(integerList);
    }
}
