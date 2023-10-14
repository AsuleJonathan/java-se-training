package com.systech.part5.concurrencycontrol;

public class SynchronizationDemo {
    private int sharedVariable = 0;

    public  synchronized void  modifySharedVariable(int value) {
        this.sharedVariable += value;
        System.out.println(sharedVariable);

    }
}
