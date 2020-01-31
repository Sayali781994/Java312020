//5.Take a elements of array from user.
package com;

import java.util.Arrays;
import java.util.Scanner;

public class _5TakeArrayElementFUser
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
    }
}
