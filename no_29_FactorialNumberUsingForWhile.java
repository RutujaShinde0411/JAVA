package com.company;
import java.util.Scanner;

public class no_29_FactorialNumberUsingForWhile {
    public static void main(String[] args) {
        int n, i=1, fact=1;

        System.out.println("Enter A Number To Find Its Factorial :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        /*for(i=1;i<=n;i++){
            fact=fact*i;
        }*/
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.format("The Factorial Of Given Number Is : %d",fact);
    }
}
