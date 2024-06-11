package com.company;
import java.util.Scanner;

public class no_17_FindWebsiteType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Website:");
        String website= sc.nextLine();

        if(website.endsWith(".com")){
            System.out.println("It's Commercial Website");
        }
        else if(website.endsWith(".org")){
            System.out.println("It's Organization Website");
        }
        else if(website.endsWith(".in")){
            System.out.println("It's Indian Website");
        }
         else{
            System.out.println("Sorry You Have Entered Invalid Website");
        }
    }
}
