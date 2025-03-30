package com.doggy.java.section51_static;

public class StaticMethodAsCreator {

    public static class MyClass{
        private MyClass(){
        }

        public static MyClass create(){
            return new MyClass();
        }

        public void doSomething(){

        }
    }

    public static void main(String[] args) {
        MyClass o = MyClass.create();
        o.doSomething();
    }
}
