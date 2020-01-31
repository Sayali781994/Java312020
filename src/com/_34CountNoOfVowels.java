//34.Count the no of vowels and consonants in the string
package com;

public class _34CountNoOfVowels {
    public static void main(String args[]){
         String str="sayali";
         int vowel=0;
         int consonant=0;
         char ch[]=str.toCharArray();
         for(int i=0;i<ch.length;i++){
             if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                 vowel++;
             }
             else{
                 consonant++;
             }
         }
         System.out.println("Vowel : "+vowel+" Consonamt :"+consonant);


    }
}
