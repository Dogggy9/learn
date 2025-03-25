package com.doggy.java.section51_static;

public class StaticIsGlobalNotStaticIsLocal {
    private static int staticField;
    private int field;

    static {
        staticField = 67;
        staticMethod1();
        staticMethod2();
    }

    public StaticIsGlobalNotStaticIsLocal() {
        field = 78;
        staticField = 89;

        method1();
        method2();

        staticMethod1();
        staticMethod2();
    }

    public static void staticMethod1(){
        staticField = 67;
        staticMethod2();
    }

    public static void staticMethod2(){
        staticField = 78;
        staticMethod1();
    }

    public void method1(){
        field = 78;
        staticField = 89;

        method2();

        staticMethod1();
        staticMethod2();
    }

    public void method2(){

    }

    public static void main(String[] args) {
        StaticIsGlobalNotStaticIsLocal o = new StaticIsGlobalNotStaticIsLocal();
        o.method1();
    }
}
