package com.telran.org.lesson20;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TestFis {

    // FileInputStream
    // FileOutputStream

    public static void main(String[] args) {
        String pathToFile = "C:\\Users\\bogyp\\IdeaProjects\\BackEndPro\\src\\main\\java\\com\\telran\\org\\lesson19"; // i use file from package lesson-19
        FileInputStream fileInputStream = null;
        try {
                fileInputStream = new FileInputStream(pathToFile + "/file.txt");
            System.out.println("Available bytes in file " + fileInputStream.available());
            fileInputStream.skip(5); // when need to skip some information from file

            while (fileInputStream.available() > 0) {
//                System.out.print(" " +  fileInputStream.read()); // byte type to change into symbols need to convert into char

                System.out.print(" " + (char) fileInputStream.read()); // byte type to change into symbols need to convert into char
            }
            fileInputStream.close();
//            int read = fileInputStream.read();
//            System.out.println("Available bytes in file " + fileInputStream.available()); // if we leave read method it will move cursor to the right by one symbol
        } catch (IOException exception) {
//            exception.printStackTrace(); // may do this instead of below line
            System.out.println("We have a problem " + exception.getMessage() + ", case " + exception.getCause());
        }
        System.out.println();

        try {
            System.out.println(fileInputStream.available());
        } catch (IOException e) {
            System.out.println("Try to use closed stream");
            e.printStackTrace();
        }

        FileReader fileReader;
        try {
            fileReader = new FileReader(pathToFile + "/file.txt");
            char[] chars = new char[20];
            int count = 0;
            while (fileReader.ready()) {
                int read = fileReader.read(chars);
                System.out.println(Arrays.toString(chars) + " count chars = " + read);
                count++;
            }
            System.out.println("Number of reads " + count);
        } catch (IOException exception) {
            System.out.println("We have a problem " + exception.getMessage());
            exception.printStackTrace();
        }
    }
}
