package com.practice.Code.interview.ignorepackage;



public class LambdaExpressionTest {
    public static void main(String[] args) {
        MathOperation mathOperation1= (a,b)-> a+b;
        MathOperation mathOperation2= (a,b)-> a-b;
        MathOperation mathOperation3= (a,b)-> a%b;
        MathOperation mathOperation4= (a,b)-> a*b;
        System.out.println(mathOperation1.operation(4,6));
        System.out.println(mathOperation2.operation(4,6));
        System.out.println(mathOperation3.operation(4,6));
        System.out.println(mathOperation4.operation(4,6));
    }


    interface MathOperation {
        int operation(int a, int b);
    }
}
