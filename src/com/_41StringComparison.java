//41.Compare two Strings
package com;

import java.util.Scanner;

public class _41StringComparison
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");

        String str1=sc.nextLine();

        System.out.println("enter the String");

        String str2=sc.nextLine();
        boolean flag=true;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)== str2.charAt(i)){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.println("the both Strings are equal");
        }
        else{
            System.out.println("the both String are not equal");
        }

    }
}
