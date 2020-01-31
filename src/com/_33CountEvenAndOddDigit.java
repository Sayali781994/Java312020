//33.count the how many even and odd digits present in number
package com;

public class _33CountEvenAndOddDigit
{
    public static void main(String args[])
    {
        int evencount=0;
        int oddcount=0;
    int num=123;
    while(num!=0){
        int remainder=num%10;
        if(remainder/2==0){
            evencount++;
        }
        else{
            oddcount++;
        }
        num=num/10;
    }
     System.out.println("even count digit "+evencount+"oddcount "+oddcount);
    }
}
