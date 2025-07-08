package com.example;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(2, 3));
        System.out.println("Product: " + calc.multiply(4, 5));
    }

    // Method with long parameter list - common code smell
    public void longParameterMethod(int a, int b, int c, int d, int e, int f) {
        // Just a dummy implementation
        System.out.println(a + b + c + d + e + f);
    }
}
