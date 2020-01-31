//47.Singleton class
package com;

public class _47SingletonClass {
    //Singlton class:in singleton class we only create one object.
    private static com._47SingletonClass myobj;
    static int count=0;
    private _47SingletonClass(){
        count++;
    }
    static {
        myobj=new com._47SingletonClass();
    }
   public static com._47SingletonClass getInstance(){
        return myobj;
    }
    public static void main(String args[]){

        com._47SingletonClass obj1=getInstance();
        com._47SingletonClass obj2=getInstance();
        com._47SingletonClass obj3=getInstance();
        com._47SingletonClass obj4=getInstance();
        System.out.println("no of objects are created"+count);
        System.out.println("First object:"+obj1);
        System.out.println("Second Object:"+obj2);
    }
}
