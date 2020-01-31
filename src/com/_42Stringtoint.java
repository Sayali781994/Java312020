package com;

public class _42Stringtoint {
    public static void main(String args[]){
        String str="111";
        char ch[]=str.toCharArray();
        int zeroascii='0';
        int sum=0;
        for(char ch1:ch){
            int tempAscii=ch1;
            sum=sum*10+(tempAscii-zeroascii);
        }
        System.out.println("String to int conversion without using Integer.parseInt metho"+sum);
    }
}
