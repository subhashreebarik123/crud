package com.java.test.JavaPrograms;

public class FactorialNumber {

    public static void main(String[] args) {

        int num = 5 ;
        int output = 1 ;
        for(int i = 1 ; i<= num ; ++i){
            output = output * i ;

        }
        System.out.println("Factorial number of 5 is " + output);
    }
}
