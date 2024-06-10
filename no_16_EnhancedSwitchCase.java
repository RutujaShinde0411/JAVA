package com.company;
import java.util.Scanner;

public class no_16_EnhancedSwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter 1 To 7 Numbers To Find Week Days");
        Scanner D = new Scanner(System.in);
        int Day = D.nextInt();

        switch (Day) {
            case 1 -> System.out.println("MONDAY");
            case 2 -> System.out.println("TUESDAY");
            case 3 -> System.out.println("WEDNESDAY");
            case 4 -> System.out.println("THURSDAY");
            case 5 -> System.out.println("FRIDAY");
            case 6 -> System.out.println("SATURDAY");
            case 7 -> System.out.println("SUNDAY");
            default -> System.out.println("Please Enter Valid Number to Find the Day");
        }
    }
}
