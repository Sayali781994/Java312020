//28.Count the how many object are created of that class.
package com;

public class _28CountObjects
{  static int count=0;
    {
        count++;
    }
    public static void main(String args[])
    {
        com._28CountObjects s1=new com._28CountObjects();

        com._28CountObjects s2=new com._28CountObjects();
        com._28CountObjects s3=new com._28CountObjects();
        com._28CountObjects s4=new com._28CountObjects();
        System.out.print("Numbers Of Objects Of your Class"+count);
    }
}
