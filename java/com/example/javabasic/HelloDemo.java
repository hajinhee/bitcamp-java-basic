package com.example.javabasic;

import java.util.Scanner;

public class HelloDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HelloApp helloApp = new HelloApp();
        System.out.println("ID: ");
        System.out.println("PW: ");
        System.out.println("NAME: ");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        String result = helloApp.hello(id, pw, name);
        System.out.println(result);

    }
}
