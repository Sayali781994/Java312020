//1.Sort array elements using bubble sort
package com;

import java.util.Arrays;
import java.util.Scanner;

public class _1ArraySortBubble {
    public static void main(String args[]){


        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        System.out.println("enter the array element");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("after sorting"+Arrays.toString(arr));

    }
}
