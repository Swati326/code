package Ac1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExceutorServiceEvenOddThread {


    private int number=1;
    private int limit=10;

    synchronized void printOdd() throws InterruptedException {
        while (number<=limit)
        {
            if(number%2==0)
            {
                wait();
            }
            if(number<=limit)
            {
                System.out.println("OddNumber: "+number);
                number++;
                notify();
            }
        }
    }

    synchronized void printEven() throws InterruptedException {
        while (number<=limit)
        {
            if(number%2!=0)
            {
                wait();
            }
            if(number<=limit)
            {
                System.out.println("EvenNumber: "+number);
                number++;
                notify();
            }
        }
    }


    public static void main(String[] args) {

        ExceutorServiceEvenOddThread exceutorServiceEvenOddThread=new ExceutorServiceEvenOddThread();

        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.submit(()-> {
            try {
                exceutorServiceEvenOddThread.printOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.submit(()-> {
            try {
                exceutorServiceEvenOddThread.printEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
