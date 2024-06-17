package com.company;

public class no_25_SumOfEvenNumberUsingWhile {
    public static void main(String[] args) {
        int n=0;
        int sum=0;

        while(n<=10){
            sum=sum+(2*n);
            n++;
        }
        System.out.println(sum);
    }
}
