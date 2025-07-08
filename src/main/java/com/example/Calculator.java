package com.example;

public class Calculator {
    // Add method
    public int add(int a, int b) {
        return a + b;
    }

    // Multiply method
    public int multiply(int a, int b) {
        return a * b;
    }

    // Add repeatedMultiply method to fix test errors
    public int repeatedMultiply(int a, int times) {
        int result = 1;
        for (int i = 0; i < times; i++) {
            result *= a;
        }
        return result;
    }
}
