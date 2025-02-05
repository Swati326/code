package com.practice.Code.interview.ignorepackage;

import org.apache.catalina.LifecycleState;

import java.util.ArrayList;
import java.util.List;

public class FruitJar {


    public static List<String> getFruits()
    {
        List<String> fruitList =new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("banana");
        fruitList.add("orange");
        fruitList.add("pineApple");
        return fruitList;
    }

    public FruitJar() {
        getFruits();
    }
}
