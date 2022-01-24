package com.yair.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;
@Data
public class CountingSystem {
    public static final CountingSystem instance = new CountingSystem();
    private CountingSystem(){}

    private Set<Counter> counters = new HashSet<>();

    public  void add(){

    }
}
