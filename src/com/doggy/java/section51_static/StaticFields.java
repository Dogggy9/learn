package com.doggy.java.section51_static;

public class StaticFields {

    private static int value;

    public static void main(String[] args) {
        StaticFields o1 = new StaticFields();
        StaticFields o2 = new StaticFields();

        o1.value=5;
        o2.value=8;

        System.out.println(o1.value);
        System.out.println(o2.value);
    }
}
