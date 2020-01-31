//24.Decimal to Octal Conversion of number.
package com;

public class _24DecimalToOctal
{
    public static void main(String args[])
    {
        int arr[]=new int[10];
        int decimal=83;
        int i=0;
        while(decimal!=0)
        {
            int remainder=decimal%8;
            arr[i]=remainder;
            i++;
            decimal=decimal/8;

        }
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
}
