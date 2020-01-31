//8.Reverse a string.
package com;

public class _8ReverseString {
    public static void main(String args[]){
        String str="sayali bhondwe";
       char ch[]= str.toCharArray();
       String rev="";
       for(int i=ch.length-1;i>=0;i--){
           rev=rev+ch[i];
       }
       System.out.print("reversed String"+rev);
    }
}
