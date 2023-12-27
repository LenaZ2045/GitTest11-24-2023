package com.telran.org.lesson23.exceptiontest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExceptionSecond {
    public static void main(String[] args) throws FileNotFoundException { // but not allowed FileNotFoundException == CAN DO JUST (THROWS EXCEPTION)
        // 1. use try-catch
        int dataOne = getData();
        System.out.println(dataOne);

        // 2. THROWS IN SIGNATURE METHOD AND HANDLES IN PARENT METHOD
        try {
            int getTwo = getDataAdditional();
            System.out.println(getTwo);
        } catch (IOException e) {
            e.printStackTrace(); // in case bad case can use PrintSTackTrace
        }
    }

    private static int getData() {
        // use try-catch
        try {
            FileInputStream fileInputStream = new FileInputStream("//user/user/one.txt");
            return 0;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static int getDataAdditional() throws IOException { // it is normal to throw Exception in the method above
        // FILE NOT FOUND EXCEPTION
        FileInputStream fileInputStream = new FileInputStream("//user/user/one.txt");
        //IO EXCEPTION
        int read = fileInputStream.read();
        return 0;
    }

    private static int getDataAdditionalTwo() {
        //Exception -> IOException -> FileNotFoundException
        try {
            // FILE NOT FOUND EXCEPTION
            FileInputStream fileInputStream = new FileInputStream("//user/user/one.txt");
            //IO EXCEPTION
            int read = fileInputStream.read();
            // block will be running from above to the bottom
        } catch (
                FileNotFoundException e) { // need to make sure the oldest-parent catch exception is not standing above younger-subsidiary catch exception
            System.out.println("File not found try another file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Try again");
        } catch (Exception e) {
            System.out.println("Get all exception");
        }
        return 0;
    }
}