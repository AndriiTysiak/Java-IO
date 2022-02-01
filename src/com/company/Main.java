package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try (FileReader inputStream = new FileReader("File1.txt"); FileWriter outputStream = new FileWriter("File.txt")) {
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
