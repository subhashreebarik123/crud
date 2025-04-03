package com.java.test.JavaPrograms;

public class FibonacciSeries {
    public static void main(String[] args) {

        int num = 10 , firstTerm = 0 , secondTerm = 1;
        int nextTerm ;
        System.out.println("Fibonacci series till " + num );
        for(int i = 1 ; i <= 10 ; i++){
             nextTerm = firstTerm + secondTerm;
            System.out.println(nextTerm);
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }

        }
    }

