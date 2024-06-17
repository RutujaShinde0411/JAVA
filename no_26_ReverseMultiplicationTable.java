package com.company;
import java.util.Scanner;

public class no_26_ReverseMultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter A Number to print Reverse Multiplication Table:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=10;i>0;i--){
            System.out.format("%d * %d = %d \n",n,i,n*i);
        }
    }
}
