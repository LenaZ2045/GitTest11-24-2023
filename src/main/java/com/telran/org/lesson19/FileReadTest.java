package com.telran.org.lesson19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileReadTest {

    public static void main(String[] args) {

        // try {
            // here might be a problem - then write exception
        // } catch (Exception e) {
            // handle exception + its type
        // }
        String pathToFile = "C:\\Users\\bogyp\\IdeaProjects\\BackEndPro\\src\\main\\java\\com\\telran\\org\\lesson19";
        try { // something that will fail our program we will catch and except it
            FileInputStream fileInputStream = new FileInputStream(pathToFile + "/file.txt"); // stream constructor is 'try catch'
            FileOutputStream fileOutputStream = new FileOutputStream(pathToFile + "/fileNew.txt");
            int data = fileInputStream.read();
            while (data != -1) {
                System.out.print((char) data); // converted bytes into chars ((char) data)
                fileOutputStream.write(data);
                data = fileInputStream.read();
            }
            fileInputStream.close();
            fileInputStream.close(); // do not forget to close
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
