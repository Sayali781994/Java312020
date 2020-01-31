//27.find out largest and smallest number among three numbers.
package com;

public class _27LargestAndSmallestElement {
    public static void main(String args[]){
        int x=10;
        int y=20;
        int z=30;
        int temp=x<y?x:y;
        int result=temp<z?temp:z;
        System.out.println("Smallest element among three numbers"+result);


        int temp1=x>y?x:y;
        int result1=temp1>z?temp1:z;
        System.out.println("largest element among three numbers"+result1);


    }
}
