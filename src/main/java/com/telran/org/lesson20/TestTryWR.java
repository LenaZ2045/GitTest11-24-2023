package com.telran.org.lesson20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestTryWR {
    public static void main(String[] args) {

        // try - with - resources

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));) { //calling method close automatically in () can create any object which are readable and closeable
            String s = bufferedReader.readLine();
            bufferedReader.close(); // do not need this method here because of line 13
        } catch (Exception e) { // log?
//            e.printStackTrace();
//            log.debug("Text");
            throw new IllegalArgumentException();
//        } finally { // can izbavitsa ot method finally
//            if (bufferedReader != null) {
//                try {
//                        bufferedReader.close();
//                    }catch (IOException e) {
//                        e.printStackTrace();
//                    }

            }
        }
    }
