//9.Reverse words of string.
package com;

public class _9ReverseWordInString {
    public static void main(String args[]){
        String str="sayali bhondwe";
        String str1[]=str.split(" ");
        for(int i=str1.length-1;i>=0;i--){
            System.out.print(str1[i]+ " ");
        }
    }
}
