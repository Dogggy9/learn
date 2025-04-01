package com.doggy.java.section061_enum;

public class EnumCanImplementInterface {

    public interface MyInterface{

        int getValue();
    }

    public enum Status implements MyInterface{

        STARTED,

        IN_PROGRESS,

        COMPLETED;

        @Override
        public int getValue() {
            return ordinal();
        }
    }

    public static void main(String[] args) {
        final MyInterface myInterface = Status.COMPLETED;

        System.out.println(myInterface.getValue());

    }
}
