package com.telran.org.lesson19;

import java.io.*;
import java.util.Scanner;

public class BufferFileTest {
    public static void main(String[] args) throws Exception { // bad idea to throw the exception into main method better to write 'try catch'
        String pathToFile = "C:\\Users\\bogyp\\IdeaProjects\\BackEndPro\\src\\main\\java\\com\\telran\\org\\lesson19";
        FileInputStream fileInputStream = new FileInputStream(pathToFile + "/file.txt"); // stream constructor is 'try catch'

        InputStream in = fileInputStream;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        //  String stringFromFile = reader.readLine(); // this is what we created at first and all lines were not read from file
        //  System.out.printf(stringFromFile); // this is what we created at first and all lines were not read from file

//        reader.lines().forEach(s -> System.out.println(s)); // to read all lines in the file we use method form Java library for Stream
        reader.lines().forEach(System.out::println); // convert to lambda expression when one variable see above sample
        fileInputStream.close(); // closing required after completing the task
        reader.close();
        System.out.println();

        FileInputStream fileInputStream1 = new FileInputStream(pathToFile + "/file.txt");
        Scanner scanner = new Scanner(fileInputStream1);
        while (scanner.hasNextLine()) {
//        String s = scanner.nextLine();
            System.out.println(scanner.nextLine());
        }
        scanner.close();
        fileInputStream1.close();
    }
}
