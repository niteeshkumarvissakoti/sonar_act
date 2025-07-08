package com.example;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(5, 10);
        int product = calc.multiply(5, 10);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
