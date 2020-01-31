//10. Check input entered by user is alphabet or not.
package com;

import java.util.Scanner;

public class _10AlphabetOrNot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter character");
        char ch=sc.next().charAt(0);
        if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
            System.out.print("entered character is alphabet");
        }
        else{
            System.out.print("entered character not alphabet");
        }
    }
}
