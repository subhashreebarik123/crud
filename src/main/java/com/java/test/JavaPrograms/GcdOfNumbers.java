package com.java.test.JavaPrograms;

public class GcdOfNumbers {
    public static void main(String[] args) {

        int p = 12, q = 32;
        int gcd =1;

        for (int i = 1; i <= p && i <= q; ++i) {
            if (p % i == 0 && q % i == 0)
                gcd = i;
            }
                System.out.println("gcd of " + p + " and " + q  + " is " + gcd );
            }
        }

