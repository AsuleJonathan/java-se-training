package com.systech.part5.concurrencycontrol;

public class SecondThread implements Runnable{

    private final int threadNumber;

    private final SynchronizationDemo se;

    public SecondThread(int threadNumber, SynchronizationDemo se) {
        this.threadNumber = threadNumber;
        this.se=se;
    }

    @Override
    public void run() {
        se.modifySharedVariable(threadNumber);
        System.out.println(+threadNumber+" is running ");
    }
}
