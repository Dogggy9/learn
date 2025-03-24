package com.doggy.java.section51_static;

import java.util.Arrays;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.parseInt;

public class StaticImport {

    public static void main(String[] args) {
        System.out.println(MAX_VALUE);
        System.out.println(parseInt("45"));

        System.out.println(MAX_VALUE);
        System.out.println(parseInt("45"));

        System.out.println(Arrays.toString(new int[0]));
    }
}
