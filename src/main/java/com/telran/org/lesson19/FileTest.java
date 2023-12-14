package com.telran.org.lesson19;

import java.io.File;
import java.util.Arrays;

public class FileTest {

    public static void main(String[] args) {
        System.out.println("1");
        // 1. create a file as object
        String pathToFile = "C:\\Users\\bogyp\\IdeaProjects\\BackEndPro\\src\\main\\java\\com\\telran\\org\\lesson19";
        File file = new File(pathToFile + "/file.txt");
        System.out.println("2");
        // 2. check if file exists
        boolean exists = file.exists();
        System.out.println("file exists? " + exists);
        System.out.println("3");
        // 3. check if file is directory or file
        System.out.println("Is current file is directory? " + file.isDirectory());
        System.out.println("3a");
        // 3a. current directory is a directory
        File fileDirectory = new File(pathToFile);
        System.out.println("fileDirectory is directory? " + fileDirectory.isDirectory());
        System.out.println("4");
        // 4. create directory - new directory
        File fileNewDir = new File(pathToFile + "/newDirectory");
        System.out.println("fileNewDir exists? " + fileNewDir.exists());
        boolean created = fileNewDir.mkdir();
        System.out.println("was it created? " + created);
        System.out.println("5");
        // 5. length of file
        System.out.println("length of file " + file.length());
        System.out.println("6");
        // 6. file delete
        File fileToDelete = new File(pathToFile + "/fileNew.txt");
        boolean delete = fileToDelete.delete();
        System.out.println("fileTwo.txt is deleted? " + delete);
        System.out.println("7");
        // 7. List of files names
        String[] list = fileDirectory.list();
        System.out.println(Arrays.toString(list));
        System.out.println("8");
        // 8. list of files
        File[] files = fileDirectory.listFiles();
        for(File elementFile : files) {
            System.out.println(elementFile.getName() + " " + elementFile.length());
        }
    }
}
