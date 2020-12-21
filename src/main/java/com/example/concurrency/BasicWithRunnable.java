package com.example.concurrency;

public class BasicWithRunnable {
    public static void main(String[] args) {
        SomeRunnable someRunnable = new SomeRunnable();
        Thread thread1 = new Thread(someRunnable);
        Thread thread2 = new Thread(someRunnable);
        Thread thread3 = new Thread(someRunnable);
        Thread thread4 = new Thread(someRunnable);
        Thread thread5 = new Thread(someRunnable);
        Thread thread6 = new Thread(someRunnable);
        Thread thread7 = new Thread(someRunnable);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        System.out.println("Thread state :" + thread1.getState().toString());
        System.out.println("Thread name :" + thread1.getName().toString());
        System.out.println("Thread id :" + thread1.getId());
        System.out.println("Thread priority :" + thread1.getPriority());
        System.out.println("Thread group :" + thread1.getThreadGroup());
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            //
        }
        System.out.println("Thread state :" + thread1.getState().toString());
    }

}


class SomeRunnable implements  Runnable {
    @Override
    public void run() {
        System.out.println("Executing run method in some class, thread is: " + Thread.currentThread());
        System.out.println("State of the thread is: " + Thread.currentThread().getState().toString());
    }
}