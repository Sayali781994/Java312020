// 2.Search element in array using linear search.
package com;

public class _2SearchElementLinear {
    public static void main(String args[]) {

        int arr[]={2,4};
        int item=1;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                flag=i+1;
                break;
            }
            else{
                flag=0;
            }
        }
        if(flag!=0){
            System.out.print("Element present in array"+flag);
        }else{
            System.out.print("element not present in an array");
        }
    }

}
