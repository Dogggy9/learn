package com.doggy.java.section51_static;

public class StaticMethodsNotPolymorph {

    static class Parent{

        void doSomething(){
            System.out.println("Parent");
        }
    }

    static class Child extends Parent{

        @Override
        void doSomething() {
            System.out.println("Child");
        }
    }

    public static void main(String[] args) {
        final Parent[] parents = {new Parent(), new Child()};
        for (final Parent parent : parents){
            parent.doSomething();
        }
    }
}
