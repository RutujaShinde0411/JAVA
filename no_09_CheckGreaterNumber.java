package com.company;
import java.util.Scanner;

public class no_09_CheckGreaterNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number to check its greater or not :");
        int num= sc.nextInt();
        System.out.println(num>8);
    }
}
