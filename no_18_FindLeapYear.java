package com.company;
import java.util.Scanner;

public class no_18_FindLeapYear {
    public static void main(String[] args) {
        System.out.println("Enter Year To Find Its Leap Or Not:");
        Scanner sc=new Scanner(System.in);
        int year= sc.nextInt();

        if((year%4==0) && (year%100!=0) && (year%400!=0)){
            System.out.println("It's A Leap Year");
        }
        else{
            System.out.println("It's Not Leap Year");
        }
    }
}
