//3.Reverse elements of array.
package com;

import java.util.Arrays;

public class _3ReverseArray {
    public static void main(String args[]){
        int arr[]={1,2,3,8};
        int start=0;
        int end=4-1;
        while(start<end){
         int temp=arr[start];
         arr[start]=arr[end];
         arr[end]=temp;
         start++;
         end--;
        }
        System.out.print("After reverse"+Arrays.toString(arr));

    }
}
