package com.doggy.java.section061_enum;

public class EnumIsExtendable {

    public enum Status{
        STARTED(1),

        IN_PROGRESS(2),

        COMPLETED(3);

        private final int value;

        Status(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public boolean isCompleted(){
            return this == COMPLETED;
        }

        @Override
        public String toString() {
            return String.valueOf(ordinal());
        }
    }

    public static void main(String[] args) {
        final Status status = Status.COMPLETED;

        System.out.println(status.isCompleted());
        System.out.println(status.getValue());

        System.out.println(status);
    }
}
