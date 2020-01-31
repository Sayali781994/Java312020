//40.Print the duplicates Character  from String
package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _40DuplicateCharactercount {
    public static void main(String args[]){
        Map<Character,Integer> m=new HashMap<Character,Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");

        String str=sc.nextLine();
         char ch[]=str.toCharArray();
         for(char ch1:ch){

             if(m.containsKey(ch1)){
                 m.put(ch1,m.get(ch1)+1);
             }
             else{
                 m.put(ch1,1);
             }
         }
         for(Map.Entry<Character,Integer> m1:m.entrySet()){

             System.out.println(m1.getKey()+":"+m1.getValue());
         }
         System.out.println("*************");
         for(Map.Entry<Character,Integer> m3:m.entrySet()){
             if(m3.getValue()>1){
                 System.out.println(m3.getKey()+":"+m3.getValue());
             }
         }



    }
}
