package com.company;
import java.util.Scanner;

public class no_14_Calculate_Marks_Average {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Marks In Physics:");
        m1=sc.nextByte();

        System.out.println("Enter Your Marks In Chemistry:");
        m2=sc.nextByte();

        System.out.println("Enter Your Marks In Biology:");
        m3=sc.nextByte();

        float avg= (m1+m2+m3)/3.0f;
        System.out.format("Your Percentage is:%f \n",avg);

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations!!, You Have Been Promoted");
        }
        else{
            System.out.println("Sorry, You Have Not Been Promoted");
        }
    }
}
