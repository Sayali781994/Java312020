//32.Calculator using switch
package com;

import java.util.Scanner;

public class _32CalculatorSwitch {
    public static void main(String args[]){
        int output=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num1");
        int num1=sc.nextInt();
        System.out.println("enter the second num2");
        int num2=sc.nextInt();
        System.out.println("Enter the operator");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':
                output=num1+num2;
                break;

            case '-':
                output=num1-num2;
                break;

            case '/':
                output=num1/num2;
                break;
            case '%':
                output=num1%num2;
                break;

            case '*':
                output=num1*num2;
                break;
            default:
                System.out.println("you have entered wrong character");
        }
        System.out.println(num1+" "+ch+" "+num2+":"+output);


    }
}
