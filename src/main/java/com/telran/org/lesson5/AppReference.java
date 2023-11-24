package com.telran.org.lesson5;

import java.util.Arrays;

public class AppReference {
    public static void main(String[] args) {
        int count = 5;
        System.out.println("Count before = " + count);
        changeCount(count);
        System.out.println("Count after = " + count); // coctoyanie ne pomenyalos zapis izmeneniya ne sohranilas...
        count = changeCountWithReturn(count); // sostoyanie pomenyalos - method result
        System.out.println("After method run result returned " + count);

        int[] arrayOne = new int[] {1, 2, 3, 4, 5}; //int[] arrayOne = {1, 2, 3, 4, 5}
        String s = Arrays.toString(arrayOne);
        System.out.println("Print array before method " + s); // sout("..." + Arrays.toString(arrayOne));
        changeArray(arrayOne);
        System.out.println("Print array after method " + Arrays.toString(arrayOne)); // zapis izmeneniya sohranyaetsa v ciilochnom masive

        Person alex = new Person("Alex"); // zapis class-object siilochnih kak created object cherez sozdanie class "Person"
        changePerson(alex);
        System.out.println("Person name " + alex.name);

        int[] arrayTwo = new int[] {1, 2, 3, 4, 5}; // created arrays and its elements
        int[] arrayThree = new int[] {1, 2, 3, 4, 5};

        if (arrayTwo == arrayThree) { // sravnili array if same = not same because checked the address-link of the arrays and not the elements
            System.out.println("Yes");
        } else {
            System.out.println("No"); // so result will be - NO
        }

        String one = "One"; // created String variable value and
        String two = "One"; // its created new variable but not the value name of the variable (it pulled what was filed before)
        if (one == two) {
            System.out.println("Yes"); // that is why they are equal - YES
        } else {
            System.out.println("No");
        }

        String three = new String("One"); // here because it is created as an object its meaning will not be equal -NO
        if (one == three) {
            System.out.println("Yes");
        } else {
            System.out.println("No"); // NO
        }
    }
    private static void changeCount(int count) {
        count += 10;
        System.out.println("Count from method = " + count);
    }

    private static int changeCountWithReturn(int count) {
        count += 10;
        System.out.println("Count from method with return = " + count);
        return count;
    }

    private static void changeArray(int[] arrayOne) { // znachenie kopii ssilki peredaetsa
        arrayOne[0] = 10;
        System.out.println("Print array result from method " + Arrays.toString(arrayOne));
    }

    private static void changePerson(Person oleg) {
        oleg.name = "Oleg";
    }
}
