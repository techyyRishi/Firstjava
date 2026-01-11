package com.company;
import java.util.Scanner;
public class Scanner_05_Class {
    public static void main(String[] args) {
        System.out.println("Give me your Input For Addition");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input 1");
        Float a = sc.nextFloat();
        System.out.println("Enter Input 2");
        float b = sc.nextFloat();
        float sum = a+b;
        System.out.println("The Sum Of These two number is");
        System.out.println(sum);
    }

}
