package com.doggy.java.section061_enum;

public class Solution2 {

    public static final class Status{

        public static final Status STARTED = new Status();

        public static final Status IN_PROGRESS = new Status();

        public static final Status COMPLITED = new Status();

        private Status(){
        }

        // started

        // in progress

        // complited
    }

    public static class Task{

        private Status status = Status.STARTED;

        public void setStatus(final Status status) {
            this.status = status;
        }
    }

    public static void main(String[] args) {
        Solution1.Task task = new Solution1.Task();
        //
        task.setStatus(Solution1.Status.IN_PROGRESS);
        //
        task.setStatus(Solution1.Status.COMPLITED);
    }
}
