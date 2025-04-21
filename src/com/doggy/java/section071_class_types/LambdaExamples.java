package com.doggy.java.section071_class_types;

public class LambdaExamples {

    @FunctionalInterface
    interface Interface1 {
        void method();
    }

    final Interface1 i1 = new Interface1() {
        @Override
        public void method() {
            System.out.println();
            System.out.println();
        }
    };

    final Interface1 i2 = () -> {
        System.out.println();
        System.out.println();
    };

    final Interface1 i3 = new Interface1() {
        @Override
        public void method() {
            System.out.println();
        }
    };

    final Interface1 i4 = () -> System.out.println();

    //------------------------------------------------------------------------------------------------------------------

    @FunctionalInterface
    interface Interface2 {
        int qwert();
    }

    final Interface2 i5 = new Interface2() {
        @Override
        public int qwert() {
            return 1;
        }
    };

    final Interface2 i6 = () -> Runtime.getRuntime().availableProcessors();

    final Interface2 i7 = new Interface2() {
        @Override
        public int qwert() {
            int sum = 4 + 5;
            return sum;
        }
    };

    final Interface2 i8 = () -> {
        int sum = 4 + 5;
        return sum;
    };
    //------------------------------------------------------------------------------------------------------------------

    @FunctionalInterface
    interface Interface3 {
        int temp(int a);
    }

    final Interface3 i9 = new Interface3() {
        @Override
        public int temp(int a) {
            return a * a;
        }
    };

    final Interface3 i10 = a -> a * a;

    final Interface3 i11 = new Interface3() {
        @Override
        public int temp(int a) {
            if(a<0){
                return 0;
            } else {
            return a * a;
            }
        }
    };

    final Interface3 i12 = var1 -> {
        if(var1<0){
            return 0;
        } else {
        return var1 * var1;
        }
    };

    //------------------------------------------------------------------------------------------------------------------

    @FunctionalInterface
    interface Interface4{
        void anyName(int integer, boolean aBoolean, String myFirstString);
    }

    final Interface4 i13 = new Interface4() {
        @Override
        public void anyName(int integer, boolean aBoolean, String myFirstString) {
            System.out.println(integer);
            System.out.println(aBoolean);
            System.out.println(myFirstString);
        }
    };

    final Interface4 i14 = (integer, aBoolean, myFirstString) -> {
        System.out.println(integer);
        System.out.println(aBoolean);
        System.out.println(myFirstString);
    };

}
