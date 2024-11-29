package com.example;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Nhap ten");
        name = scanner.nextLine().toUpperCase();
        System.out.println("Nhap tuoi");
        age = scanner.nextInt();
        scanner.close();
        System.out.println("Sinh vien " + name + " Co so tuoi la: " + age);
    }
}
