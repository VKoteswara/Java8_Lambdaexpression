package com.nisum.demos;

import com.nisum.functionalinterfaces.MyInterface;
import com.nisum.functionalinterfaces.SingleParameter;

public class Example {

    public void myMethod(){
        System.out.println("Instance Method");
    }
    public String myMethod(String str){
        return  str;
    }
    public static void main(String[] args) {
        Example obj = new Example();
        // Method reference using the object of the class
        MyInterface ref = obj::myMethod;
        // Calling the method of functional interface
        ref.display();

        SingleParameter sp=obj::myMethod;
        System.out.println(sp.singleParameter("Nisum"));
    }
}
