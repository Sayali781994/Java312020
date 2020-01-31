//16.Check number entered by user is prime or not.
package com;

public class _16CheckPrimeNum {
    public static void main(String args[])
    {
        int num=4;
        boolean flag=true;
        for(int i=2;i<num-1;i++)
        {
          if(num%i==0){
              flag=false;
              break;
          }
          else{
              flag=true;
          }

        }
        if(flag==true){
            System.out.print("the number is prime");
        }
        else{
            System.out.println("the number is not prime");
        }
    }
}
