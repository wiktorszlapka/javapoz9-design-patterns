package com.sda.singleton;

public class Application {
    public static void main(String[] args) {

        Thread consumerThread = new Thread((new Consumer()));
        Thread consumerThread2 = new Thread((new Consumer()));
        Thread producerThread = new Thread(new Producer());
        Thread producerThread2  = new Thread(new Producer());

        producerThread.start();
        producerThread2.start();
        consumerThread.start();
        consumerThread2.start();

    }
}
