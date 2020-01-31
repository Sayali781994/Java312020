//30.fibonacci series
package com;

import java.util.Scanner;

public class _30FibnocciesSeries
{
    public static void main(String args[])
    {
        int n1=0;
        int n2=1;
        int n3;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the count");
       int n=sc.nextInt();
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<=n;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");

        }


    }
}
