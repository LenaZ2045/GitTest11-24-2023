package com.telran.org.lesson19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferInputTest {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in; // buffer holds more information than scanner
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // real time code writing is as:
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        String s1 = reader.readLine();
        bufferedReader.close();
        reader.close();

        System.out.println(s);
        System.out.println(s1);
    }
}
