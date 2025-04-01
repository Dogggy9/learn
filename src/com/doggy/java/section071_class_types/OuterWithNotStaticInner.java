package com.doggy.java.section071_class_types;

public class OuterWithNotStaticInner {

    private static int value1;
    private int value2;

    static void staticMethod(){

    }

    void method(){

    }

    class Inner{

        void m(){
            value1 = 7;
            value2 = 5;
            staticMethod();
            method();
        }

    }
}
