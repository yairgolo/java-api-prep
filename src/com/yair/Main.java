package com.yair;

import com.yair.model.Counter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter( 4);
        counter.start();

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            int num = 0;
            while (num < 100) {
                myWriter.write(num + "  ");
                num++;
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
