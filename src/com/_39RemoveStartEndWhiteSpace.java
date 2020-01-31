//39.Remove Starting and ending whitespaces.
package com;

import java.util.Scanner;

public class _39RemoveStartEndWhiteSpace {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");

        String str=sc.nextLine();
                     String str1=str.trim();
                     System.out.println("str1:" +
                             ""+str1);

    }
}
