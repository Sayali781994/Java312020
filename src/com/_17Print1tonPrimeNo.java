//17.Print 1 to n prime numbers.
package com;

public class _17Print1tonPrimeNo {
    public static void main(String args[]){
        for(int i=1;i<=10;i++){
            boolean flag=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;

                }


            }
            if(flag==true){
                System.out.print(i+" ");
            }
        }

    }
}
