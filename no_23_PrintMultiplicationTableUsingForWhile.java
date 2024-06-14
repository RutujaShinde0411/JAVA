package com.company;
import java.util.Scanner;

public class no_23_PrintMultiplicationTableUsingForWhile {
    public static void main(String[] args) {

        System.out.println("Enter A Number that you print table:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        /*for(int i=1;i<=10;i++){
            System.out.format("%d * %d= %d \n",n,i,n*i);
        }*/
        while(i<=10){
            System.out.format("%d * %d = %d \n",n,i,n*i);
            i++;
        }
    }
}

