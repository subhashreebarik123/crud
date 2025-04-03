package com.java.test.SynchronousAnsAsynchrnous;

public class SynchronousExample {
    public static void main(String[] args) {
        System.out.println("Task 1 is started");
        performTask();
        System.out.println("Task 2 is started");
    }

    public static void performTask(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Task 1 is completed");
    }
}
