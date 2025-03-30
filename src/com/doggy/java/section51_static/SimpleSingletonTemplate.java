package com.doggy.java.section51_static;

public final class SimpleSingletonTemplate {

    public static class Singleton{

        private static final Singleton INSTANCE = new Singleton();
        private Singleton(){
        }

        public static Singleton getINSTANCE() {
            return INSTANCE;
        }

        public void doSomething1(){}
        public void doSomething2(){}
        public void doSomething3(){}
    }

    public static void main(String[] args) {
        final Singleton singleton = Singleton.getINSTANCE();
        singleton.doSomething1();
        singleton.doSomething2();
        singleton.doSomething3();
    }
}
