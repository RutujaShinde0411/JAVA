package com.company;

public class no_10_StringMethods {
    public static void main(String[] args) {
        String name="Have A Nice Day";

        System.out.format("The Length Of String is:%s \n", name.length());

        String lstring= name.toLowerCase();
        System.out.println(lstring);

        String ustring= name.toUpperCase();
        System.out.println(ustring);

        String modifyString= "         Kunal";
        String trimstr= modifyString.trim();
        System.out.println(trimstr);

        System.out.println(name.substring(2,9));

        System.out.println(name.replace('a','k'));

        System.out.println(name.startsWith("Ha"));

        System.out.println(name.endsWith("y"));

        System.out.println(name.charAt(5));

        System.out.println(name.indexOf("y"));

        System.out.println(name.lastIndexOf("a"));

        System.out.println(name.equals("Have A Nice Day"));

        System.out.println(name.equalsIgnoreCase("have a nice day"));

        System.out.println("I am escape Sequence \\ double backslash");
    }
}
