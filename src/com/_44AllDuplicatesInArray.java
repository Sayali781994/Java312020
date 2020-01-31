//44.Print All Duplicates elements of an array
package com;

public class _44AllDuplicatesInArray {
    public static void main(String args[]){
        int arr[]={1,4,2,3,1,3,4};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" ");
                    break;
                }
            }
        }


    }
}
