package com.practice.Code.interview.ignorepackage;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class SupplyAsyncClass {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        CompletableFuture<List<String>> completableFuture = CompletableFuture.supplyAsync(FruitJar::getFruits);
        completableFuture.join();
    }
}
