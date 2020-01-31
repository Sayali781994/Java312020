//36.Remove vowels from string using built in function replaceAll
package com;

import java.util.Scanner;

public class _36RemoveVowel
{
    public static void main(String args[])
    {


        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");

        String str=sc.nextLine();
        String str1=str.replaceAll("[aeiouAIOUE]","");
        System.out.println(str1);

    }
}
