package com.doggy.java.section51_static;

import java.util.Arrays;

public class UsingClassInsteadOfObject {

    private static int value;

    public static int getValue() {
        return value;
    }

    public static void main(String[] args) {

        value = 5;
        value = 8;

        System.out.println(value);
        System.out.println(value);
        System.out.println(getValue());

        System.out.println(Arrays.toString(new int[]{1, 2, 3}));
    }
}
