package com.company;

public class no_30_PrintArrayElementReverseOrder {
    public static void main(String[] args) {
        int [] marks={100,60,65,45,56};

        for(int i=marks.length-1; i>=0;i--){
            System.out.println(marks[i]);
        }
    }
}
