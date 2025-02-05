package com.practice.Code.interview.ignorepackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureTest {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add(null);
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        ExecutorService executorService = Executors.newFixedThreadPool(list.size());
        List<CompletableFuture<Void>> completableFutureList = new ArrayList<>();
        for (String str : list) {
            try {
                CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
                    String lowerString = str.toUpperCase();
                    System.out.println("lower string:"+lowerString);
                }, executorService);
                completableFutureList.add(completableFuture);
            } catch (Exception exception) {
                System.out.println("Exception in string: "+str);

            }

//                 completableFuture.get() -> if we call this method, it will block the thread, until completable future is success
        }
        //  what is runAsync vs supplyAsync() in compatable feature


    }
}
