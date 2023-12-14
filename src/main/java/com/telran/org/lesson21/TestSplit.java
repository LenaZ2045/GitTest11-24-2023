package com.telran.org.lesson21;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class TestSplit {

    public static void main(String[] args) {
        String text = "I learned about TelRan college and now I am studying Java";
        String[] strings = text.split(" ");

        for (String temp : strings) {
            System.out.println(temp);
        }
        String text1 = "I+learned+about+TelRan+college+and+now+I+am+studying+Java";
        String[] strings1 = text1.split("\\+");
        for (String temp : strings1) {
            System.out.println(temp);
        }
        String text2 = "I1learned2about3TelRan4college5and6now7I8am9studying0Java";
        String[] strings2 = text2.split("[0-9]"); // the \\d is analog for [0-9]
        for (String temp : strings2) {
            System.out.println(temp);
        }

        String[] strings3 = new String[0];
        try {
            Pattern pattern = Pattern.compile("\\d{}"); // if I input {2} it shows whole text2 in console otherwise it shows exception pattern and its description
            strings3 = pattern.split(text2);
        } catch (PatternSyntaxException exception) {
            System.out.println(exception.getPattern());
            System.out.println(exception.getDescription());
        }
        for (String temp : strings3) {
            System.out.println(temp);
        }
    }
}
