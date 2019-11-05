package cn.jrexe.learn.base;

import java.util.Scanner;

public class LearnScanners {
    public static void main(String[] args) {
        double salary = 0;
        System.out.println("请输入你的收入 ");
        Scanner scanner = new Scanner(System.in);
        salary = scanner.nextDouble();
        System.out.println("实际收入 :" + salary *0.2);
        System.out.printf("%h","1");


    }
}