package com.doggy.java.section061_enum;

public class Solution1 {

    public static final class Status{

        public static final int STARTED = 1;

        public static final int IN_PROGRESS = 2;

        public static final int COMPLITED = 3;

        private Status(){
        }

        // started

        // in progress

        // complited
    }

    public static class Task{

        private int status = Status.STARTED;

        public void setStatus(final int status) {
            this.status = status;
        }
    }

    public static void main(String[] args) {
        Task task = new Task();
        //
        task.setStatus(Status.IN_PROGRESS);
        //
        task.setStatus(Status.COMPLITED);
    }
}
