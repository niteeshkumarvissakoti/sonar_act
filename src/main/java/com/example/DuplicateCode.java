package com.example;

public class DuplicateCode {
    public void printHello() {
        System.out.println("Hello, world!");
    }
    public void printHello() {
        System.out.println("Hello, world!");
    }

    // Duplicate method for SonarCloud to catch duplication
    public void printHelloAgain() {
        System.out.println("Hello, world!");
    }
}
