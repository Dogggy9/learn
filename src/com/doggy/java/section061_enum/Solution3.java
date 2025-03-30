package com.doggy.java.section061_enum;

public class Solution3 {

    public enum Status{

        STARTED,

        IN_PROGRESS,

        COMPLITED;

        private Status(){
        }

        // started

        // in progress

        // complited
    }

    public static class Task{

        private Solution2.Status status = Solution2.Status.STARTED;

        public void setStatus(final Solution2.Status status) {
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
