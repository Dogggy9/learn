package com.doggy.java.section51_static;

public class InterfaceFields {
    private static class MyClass{
        public static final int VALUE = 67;
    }

    private interface MyInterface{
        int VALUE = 56;

    }

    public static void main(String[] args) {
        System.out.println(MyClass.VALUE);
        System.out.println(MyInterface.VALUE);
    }
}
