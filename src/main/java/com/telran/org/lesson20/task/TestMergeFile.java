package com.telran.org.lesson20.task;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class TestMergeFile {

    public static void main(String[] args) {

        String pathToFile = "C:\\Users\\bogyp\\IdeaProjects\\BackEndPro\\src\\main\\java\\com\\telran\\org\\lesson20\\task";
        List<String> result = new ArrayList<>(); // meaning form the file

        String inputNames = "A_B_C_D";
        String[] names = inputNames.split("_");
        TestMergeFile testMergeFile = new TestMergeFile();
        Arrays.stream(names).forEach(name -> {
            String dataFromFile = testMergeFile.getDataFromFile(pathToFile + "/" + name + ".txt");
            result.add(dataFromFile);
        });
        System.out.println(result);
        String pathToOutFile = pathToFile + "/outputFile.tst";

        testMergeFile.writeDataToFile(pathToOutFile, result.stream().collect(Collectors.joining(" ")));
    }

    private void writeDataToFile(String path, String content) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(content);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private String getDataFromFile(String path) {
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader(path)) {
            while (fileReader.ready()) {
                sb.append((char) fileReader.read());
            }
        } catch (Exception exception) {
        }
        return sb.toString();
    }
}
