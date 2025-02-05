package com.practice.Code.interview.ignorepackage;

import java.util.Arrays;
import java.util.List;



@FunctionalInterface // its not mandtory to define FunctionalInterface as it has only one method
interface Addable {
    int add(int a,int b);
}
public class Lambda {
        public static void main(String[] args) {
            Addable addable=(p,q)->(p+q);
            addable.add(23,70);
        }

    }

