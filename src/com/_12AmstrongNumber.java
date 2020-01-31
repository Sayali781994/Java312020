//12.Armstrong Number.
package com;

public class _12AmstrongNumber
{
    public static void main(String args[])

    {
        int num=153;
        int sum=0;
        while (num!=0){
            int remainde=num%10;
            sum= (int) (sum+Math.pow(remainde,3));
            num=num/10;
        }
        if(sum==num){
            System.out.print("this is the amstrong number");
        }
        else{
            System.out.print("this number is not amstrong");
        }

    }
}
