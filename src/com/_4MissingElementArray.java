//4.find out the missing element in array.
package com;

public class _4MissingElementArray {
    public static void main(String args[]){
        int arr[]={1,2,3,5};
        int n=arr.length+1;
        int Expected_sum=n*(n+1)/2;
        int actual_sum=0;
        for(int i=0;i<arr.length;i++){
            actual_sum=arr[i]+actual_sum;
        }
        int missing_element=Expected_sum-actual_sum;
        System.out.print("missing_element _in_Array"+missing_element);
    }
}
