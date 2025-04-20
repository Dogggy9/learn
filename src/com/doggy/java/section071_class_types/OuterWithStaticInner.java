package com.doggy.java.section071_class_types;

public class OuterWithStaticInner {
    private static int value1 = 1;
    private int value2 = 2;

    private static void staticMethod(){

    }

    private void method(){

    }

    public static class Inner{
        void m(){
            value1 = 90;
            staticMethod();

        }
    }

    public static void main(String[] args) {
        Inner o = new Inner();
    }
}
