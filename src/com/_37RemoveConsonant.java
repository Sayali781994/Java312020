//37.Remove Consonants.
package com;

import java.util.Scanner;

public class _37RemoveConsonant {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");

        String str=sc.nextLine();
        String str1=str.replaceAll("[bcdfghjklmnpqrstvwxyz]","");
        System.out.println(str1);

    }

}
