//46. check number is even or odd without using mod

package com;

import java.util.Scanner;

public class _46EvenWithoutMod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");

        int number=sc.nextInt();
        if((number/2)*2==number){
            System.out.println("the number is even");
        }
        else {
            System.out.println("the number is odd");
        }
    }
}
