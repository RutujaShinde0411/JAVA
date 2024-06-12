package com.company;
import java.util.Scanner;

public class no_19_DoWhileLoop {
    public static void main(String[] args) {
        int i=1;
        System.out.println("Enter A Number That You Print Natural Numbers Up to:");
        Scanner no=new Scanner(System.in);
        int n= no.nextInt();

        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
