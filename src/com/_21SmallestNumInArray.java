//21.Find out the smallest number in array.
package com;

public class _21SmallestNumInArray {
    public static void main(String args[]){
        int arr[]={3,65,7,9};
int smallest=Integer.MAX_VALUE;
for(int number:arr){
    if(number<smallest){
        smallest=number;
    }

}
System.out.print("the Smallest element in array"+smallest);
    }

}
