//22.Largest element of array.
package com;

public class _22LargestNumInArray {
    public static void main(String args[]){
        int arr[]={2,6,5,4};
        int largest=Integer.MIN_VALUE;
        for(int number:arr){
            if(number>largest){
                largest=number;
            }
        }
        System.out.println("the number is lagest in array"+largest);

    }
}
