package com.granovskiy;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(doFactorial(5));
        System.out.println(doFibonacci(25));
    }
    private static int doFactorial(int n) {
        return (n == 1 ? 1 : n * doFactorial (n - 1));
    }
    private static int doFibonacci (int n) {
        if (n == 0 || n == 1) return n;
        return doFibonacci(n - 1) + doFibonacci(n - 2);
    }
}
