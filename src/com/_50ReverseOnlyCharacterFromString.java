//50.Reverse Only characters of words.
package com;

import java.util.Scanner;

public class _50ReverseOnlyCharacterFromString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");

        String str=sc.nextLine();
        String rev="";
        String ar[]=str.split(" ");
        for(int i=0;i<ar.length;i++){
            for(int j=ar[i].length()-1;j>=0;j--){
                rev=rev+ar[i].charAt(j);
            }
            rev+=" ";
        }
        System.out.println("Reversed the only characters from String :"+rev);

    }


}
