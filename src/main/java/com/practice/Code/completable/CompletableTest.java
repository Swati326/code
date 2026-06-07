package com.practice.Code.completable;

import java.util.Comparator;
import java.util.concurrent.CompletableFuture;

public class CompletableTest {

    public static void main(String[] args) {

        // Fetch the number asynchronously, multiply by 10, and consume it
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
                   // System.out.println("Fetching number...");
                    return 5;
                }).thenApply(n -> n * 10)  // multiply by 10
                .thenAccept(result -> System.out.println("Result: " + result));  // consume the result

        CompletableFuture<Void> completableFuture=CompletableFuture.supplyAsync(()->{
                return 6;
                }).thenApply(n->n*10).thenAccept(System.out::println);
        completableFuture.join();




        // Wait for the async tasks to finish
        future.join();
    }
}
