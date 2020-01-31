//25.Remove duplicates from string
package com;

import java.util.HashSet;
import java.util.Set;

public class _25RemoveDuplicateString {
    public static void main(String args[]){
        String str="sayali";
        Set<Character> set=new HashSet<Character>();
        StringBuffer str1=new StringBuffer();

        char ch[]=str.toCharArray();
        for(char ch1:ch){
            if(!set.contains(ch1)){
                set.add(ch1);
                str1.append(ch1);

            }
        }
        System.out.print("Removed duplicates from String"+" "+str1);

    }
}
