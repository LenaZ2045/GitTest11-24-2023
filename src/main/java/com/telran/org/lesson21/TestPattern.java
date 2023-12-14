package com.telran.org.lesson21;

import java.util.regex.Pattern;

public class TestPattern {

    public static void main(String[] args) {
        String regex = ".*www.*"; // symbols before (www) and after
        String actual = "www.telran.de";
        Pattern pattern = Pattern.compile(regex);
        boolean matches = pattern.matcher(actual).matches();
        System.out.println("actual string contains REGEX " + matches);
    }
}
