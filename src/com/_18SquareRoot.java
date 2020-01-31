//18.Find out the square root of the number.
package com;

public class _18SquareRoot
{
    public static void main(String args[])
    {
        int num=16;
        double temp;
        double sr=num/2;
        do{
            temp=sr;
            sr=(temp+(num/temp))/2;

        }while(temp-sr!=0);
        System.out.print(sr);
    }
}
