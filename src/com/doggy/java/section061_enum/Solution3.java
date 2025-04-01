package com.doggy.java.section061_enum;

public class Solution3 {

    public enum Status{

        STARTED,

        IN_PROGRESS,

        COMPLITED;
    }

    public static class Task{

        private Status status = Status.STARTED;

        public void setStatus(final Status status) {
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
