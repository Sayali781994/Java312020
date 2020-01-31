// 23.Octal to Decimal conversion of number.
package com;

public class _23OctalToDecimal {
    public static void main(String args[]){
        int octalNum=123;
        int decimalNum=0;
        int base=1;
        while(octalNum!=0){
          int remainder=octalNum%10;
          decimalNum=decimalNum+remainder*base;
          base=base*8;
          octalNum=octalNum/10;
        }
        System.out.print("Decimal Value"+decimalNum);
    }
}
