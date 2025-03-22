package com.doggy.java.section51_static;

public class StaticSections {

    private static class MyClass{
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

    private static class Launcher{
        public static void main(String[] args) {
            System.out.println(MyClass.getValue());
        }
    }
}
