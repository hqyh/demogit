package com.interview.javabasic.thread;

public class ThreadTest {
    private static void attack(){
        System.out.println("Fight");
        System.out.println("Cuttent Thread is:"+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                attack();
            }
        };
        System.out.println("current main thread is:"+Thread.currentThread().getName());
        //t.run();
        t.start();
    }
}
