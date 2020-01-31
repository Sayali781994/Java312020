//49.Find Second largest element of an array
package com;

import java.util.Arrays;

public class _49FindSecondLarEleInArray
{
    public static void main(String args[])
    {
       int arr[]={2,5,3,6};
        Arrays.sort(arr);
     System.out.println("Second Largest Element in Array"+arr[arr.length-2]);
     String str1="sayali";
     String str2="ilayas";
     char str1arr[]=str1.toCharArray();
     char str2arr[]=str2.toCharArray();
     Arrays.sort(str1arr);
     Arrays.sort(str2arr);
     boolean flag=Arrays.equals(str1arr,str2arr);
     if(flag==true){
         System.out.println("the both Strings are anagram");
     }
     else{
         System.out.println("the both string are not anagram");
     }
    }
}
