//35.Check year is leap or not
package com;

import java.util.Scanner;

public class _35LeapYearNot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year");
        int year=sc.nextInt();

     if(year%4==0){
         System.out.println("this is the leap year");
     }
     else{
         System.out.println("not a leap year");
    }
    }
}
