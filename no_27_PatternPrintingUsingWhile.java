package com.company;

public class no_27_PatternPrintingUsingWhile {
    public static void main(String[] args) {
       int i=1, n=4;

        while(i<=n){
            int j=n;
            while(j>=i) {
                System.out.print("*");
                j--;
            }
            System.out.println("\n");
            i++;
        }
    }
}
