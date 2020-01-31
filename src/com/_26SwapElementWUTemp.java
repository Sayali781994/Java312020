//26.Swap element without using third varible
package com;

public class _26SwapElementWUTemp {
    public static void main(String args[]){
        int x=10;
        int y=20;
        System.out.print("before swapping"+"x:"+x+" "+"y:"+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.print("after swapping"+"x:"+x+" "+"y:"+y);

    }
}
