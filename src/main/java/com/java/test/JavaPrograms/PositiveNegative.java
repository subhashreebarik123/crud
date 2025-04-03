package com.java.test.JavaPrograms;

public class PositiveNegative {
    public static void main(String[] args) {

        int number = 30 ;

        if(number > 0 ){
            System.out.println(number + " is a positive number");
        } else if (number < 0 ) {
            System.out.println(number + " is a negative number");
        }else {
            System.out.println(number + " is a zero");
        }
    }
}