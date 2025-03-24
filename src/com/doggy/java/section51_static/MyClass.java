package com.doggy.java.section51_static;

public class MyClass {
    private static final int value;

    static {
        if (Runtime.getRuntime().availableProcessors() == 4){
            value = 2;
        } else {
            value = 4;
        }
    }

    public static int getValue() {
        return value;
    }
}
