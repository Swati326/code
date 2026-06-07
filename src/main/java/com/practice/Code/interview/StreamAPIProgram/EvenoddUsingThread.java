package com.practice.Code.interview.StreamAPIProgram;

public class EvenoddUsingThread {


    public static void main(String[] args) {

        Thread thread=new Thread(()->CheckIfNumberIsEvenOROdd(6),"Thread-05");
        thread.start();

    }

   static boolean CheckIfNumberIsEvenOROdd(int a)
   {
       if(a%2==0)
       {
           System.out.println(Thread.currentThread().getName()+"even:");
           return true;
       }
       else {
           System.out.println(Thread.currentThread().getName()+"odd:");
           return false;
       }


   }

}
