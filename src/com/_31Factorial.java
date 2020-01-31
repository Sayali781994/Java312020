//31.Find out the factorial of the number.
package com;

import java.util.Scanner;

public class _31Factorial
{
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.print("Factorial of"+num+":"+factorial);
    }
}
