package com.systech.part5.concurrencycontrol;

public class ThreadDemo {
    public static void main(String[] args) {
        DeadlockAvoidance deadlockAvoidanceExample = new DeadlockAvoidance();
        deadlockAvoidanceExample.performTask1();
        deadlockAvoidanceExample.performTask2();
    }
}