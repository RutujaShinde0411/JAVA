package com.company;
import java.util.Scanner;

public class no_02_Get_Input_From_User {
    public static void main(String[] args) {
        System.out.println("Scanner class is used for take input from user");

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Number 1 : ");
        int no1= sc.nextInt();

        System.out.println("Enter Number 2 : ");
        int no2= sc.nextInt();

        System.out.println("Enter Number 3 : ");
        int no3= sc.nextInt();

        int Sum= no1+no2+no3;
        System.out.format("The Sum Of Given Three Numbers Is : %d ",Sum);
    }
}
