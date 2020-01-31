//28.Count the number of digits in that number
package com;

public class _29NumOfDigitInInt {
    public static void main(String args[]){
        int a=123;
        int count=0;
        String str=Integer.toString(a);
        String b=String.valueOf(a);
        System.out.println(str.length()+" digit contains in this Integer");
        while(a!=0){
            a=a/10;
            count++;

        }
        System.out.println("This is the the count of how many digits are present in integer"+count);

    }
}
