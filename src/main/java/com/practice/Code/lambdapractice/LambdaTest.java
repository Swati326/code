package com.practice.Code.lambdapractice;

public class LambdaTest {

    //PS= add two mnumber using lamda expression

    public static void main(String[] args) {

        Add add= (x,y)-> (x+y);
        System.out.println(add.addition(87,45));

    }

    // what is lamda expression and functional interface
    // lE= annoymous fn and functional style coding
    //FI- only one abstarct method.

    interface  Add{
        Integer addition(int a, int b);
    }


}
