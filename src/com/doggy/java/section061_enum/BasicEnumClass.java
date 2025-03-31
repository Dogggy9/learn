package com.doggy.java.section061_enum;

public class BasicEnumClass {

    public enum Status{

        STARTED,

        IN_PROGRESS,

        COMPLITED;
    }

    public static void main(String[] args) {
        final Status status = Status.COMPLITED;

        System.out.println(status);
        System.out.println(status.name());
        System.out.println(status.ordinal());

        System.out.println(Status.COMPLITED.ordinal());
        System.out.println(Status.IN_PROGRESS.ordinal());

        final Status status1 = Status.valueOf("COMPLITED");

        System.out.println(status == status1);


        final Status status2 = Enum.valueOf(Status.class, "COMPLITED");

        System.out.println(status1);
        System.out.println(status2);

        for (Status value : Status.values()) {
            System.out.print(value+", ");
        }
    }
}
