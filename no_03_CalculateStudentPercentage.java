package com.company;
import java.util.Scanner;

public class no_03_CalculateStudentPercentage {
    public static void main(String[] args) {
        System.out.println("Let's Calculate The Percentage Of Student");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Physics Marks :");
        int phy= sc.nextInt();

        System.out.println("Enter Your Chemistry Marks :");
        int chem= sc.nextInt();

        System.out.println("Enter Your Biology Marks :");
        int bio= sc.nextInt();

        System.out.println("Enter Your Mathematics Marks :");
        int math=sc.nextInt();

        System.out.println("Enter Your Computer Marks :");
        int eng=sc.nextInt();

        int sum= phy+chem+bio+math+eng;

        float percentage=sum/500.0f*100;

        System.out.format("The Percentage Of Student Is : %f", percentage);
    }
}
