package com.yair.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor

public class Counter extends Thread{
    private int goal;

    @Override
    public void run() {
        int num = 0;
        while (num <= goal){
            System.out.println(num);
            num++;
        }
    }
}
