package com.company;
import java.util.Scanner;

public class no_32_CheckIntegerPresentInArray {
    public static void main(String[] args) {
        int [] array={23,4,56,78,98,98,75,32};
        int num;
        boolean isinarray=false;
        System.out.println("Enter An Integer To Check Is In Array Or Not: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        for(int e:array){
            if(e==num){
                isinarray=true;
                break;
            }
        }
        if(isinarray){
            System.out.println("The Value Is Present In Array");
        }
        else{
            System.out.println("The Value Is Not Present In Array");
        }
    }
}
