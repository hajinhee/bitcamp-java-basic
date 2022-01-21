package com.example.javabasic;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();
        System.out.println(LoginApp.webSite);
        System.out.println("ID: ");
        System.out.println("PW: ");
        System.out.println("NAME: ");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        String result = loginApp.login(id, pw, name);
        System.out.println(result);
    }
}
