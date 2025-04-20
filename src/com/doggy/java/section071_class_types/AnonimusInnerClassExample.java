package com.doggy.java.section071_class_types;

public class AnonimusInnerClassExample {

    private final AbstractClass field = new AbstractClass() {
        @Override
        public void method() {
            System.out.println("Hello world");

        }
    };

    public static void main(String[] args) {
        AnonimusInnerClassExample example = new AnonimusInnerClassExample();
        example.field.method();
    }
}
