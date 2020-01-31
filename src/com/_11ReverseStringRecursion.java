//11.Reverse string using recursion.
package com;

public class _11ReverseStringRecursion {
    public static void main(String[] args) {
        String str = "sayali bhondwe";
        String rev = reverseString(str);
        System.out.print(rev);

    }

    static String reverseString(String str) {
       if(str.isEmpty())
           return  str;

        return reverseString(str.substring(1))+str.charAt(0);
    }
}
