package com.practice.Code.interview.ignorepackage;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class StudentManagement {

        public static void main(String[] args) throws ExecutionException, InterruptedException {

            // Fetch student details asynchronously
            CompletableFuture<String> studentDetails = CompletableFuture.supplyAsync(() -> {
                sleep(500); // Simulate delay
                return "Student Details: [Name: John, ID: 12345]";
            });

            // Fetch grades asynchronously
            CompletableFuture<String> studentGrades = CompletableFuture.supplyAsync(() -> {
                sleep(700); // Simulate delay
                return "Grades: [Math: A, Science: B+, English: A-]";
            });

            // Fetch attendance asynchronously
            CompletableFuture<String> studentAttendance = CompletableFuture.supplyAsync(() -> {
                sleep(300); // Simulate delay
                return "Attendance: [Present: 85%, Absent: 15%]";
            });

            // Combine all results and print
            CompletableFuture<Void> allTasks = CompletableFuture.allOf(studentDetails, studentGrades, studentAttendance)
                    .thenRun(() -> {
                        try {
                            System.out.println(studentDetails.get());
                            System.out.println(studentGrades.get());
                            System.out.println(studentAttendance.get());
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    });

            // Wait for all tasks to complete
            allTasks.join();
            System.out.println("All tasks completed!");
        }

        // Utility method to simulate delay
        private static void sleep(int milliseconds) {
            try {
                Thread.sleep(milliseconds);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }
    }


