package com.company;
import java.util.Scanner;

public class no_15_SwitchCaseExample {
    public static void main(String[] args) {
        System.out.println("Enter 1 To 7 Numbers To Find Week Days");
        Scanner D=new Scanner(System.in);
        int Day= D.nextInt();

        switch (Day){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Please Enter Valid Number to Find the Day");
        }
        System.out.println("Thanks For Using My Java Code!!");
    }
}
