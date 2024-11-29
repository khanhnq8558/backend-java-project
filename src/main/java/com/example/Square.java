package com.example;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap hai canh cua hinh");
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float dienTich = x * y;
        float chuVi = (x + y) / 2;
        float cachNho = (x < y) ? x : y;
        System.out.println("Dien tich hinh chu nhat la: " + dienTich);
        System.out.println("Chu vi hinh chu nhat la: " + chuVi);
        System.out.println("Canh nho nhat trong 2 cach la: " + cachNho);
    }
}
