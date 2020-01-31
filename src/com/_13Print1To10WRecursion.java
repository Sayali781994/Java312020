//13.Print 1 to 10 numbers without using loop.
package com;

public class _13Print1To10WRecursion {
    public static void main(String args[]){
        printMethod(1);
    }
    static void printMethod(int n){
        if(n<=10){
            System.out.print(n+" ");
        }
        printMethod(n+1);
    }
}
