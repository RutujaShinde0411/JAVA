package com.company;

public class no_28_SumOfNumInMulicationTable {
    public static void main(String[] args) {
        int n=2,sum=0;

        for(int i=1;i<=10;i++){
            sum= sum+(n*i);
        }
        System.out.format("The Sum Of Multilplication Table Of %d : %d",n,sum);
    }
}
