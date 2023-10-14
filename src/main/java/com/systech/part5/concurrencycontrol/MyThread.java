package com.systech.part5.concurrencycontrol;

public class MyThread extends Thread  {
    private final int threadNumber;
    SynchronizationDemo se ;
    public MyThread(int threadNumber,SynchronizationDemo se) {
        this.threadNumber = threadNumber;
        this.se=se;
    }

    @Override
    public void run() {
        se.modifySharedVariable(threadNumber);
        System.out.println(+threadNumber+" is running ");
    }
}
