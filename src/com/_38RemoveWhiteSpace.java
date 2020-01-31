//38.Remove WhiteSpaces
package com;

import java.util.Scanner;

public class _38RemoveWhiteSpace {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");

        String str=sc.nextLine();
        String str1=str.replaceAll("\\s","");
        System.out.println(str1);
    }
}
