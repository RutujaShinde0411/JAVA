package com.company;
import java.util.Scanner;

public class no_07_KilometersToMile {
    public static void main(String[] args) {
        System.out.println("Enter Kilometers To Convert Into Miles: ");

        Scanner sc = new Scanner(System.in);
        double km= sc.nextDouble();

        double miles=(km/1.6);

        System.out.format("Miles :%f",miles);


    }
}
