package com.java.test.JavaPrograms;

public class LcmOfNumbers {
    public static void main(String[] args) {

        int n1 = 24 , n2 = 56 ;
        int lcm = (n1>n2)?n1:n2;

        while (true){
            if(lcm%n1==0 && lcm%n2==0){
                break;
            }
            lcm++;

        }
        System.out.println("lcm of " + n1 + " and " + n2 + " is " + lcm);


    }
}