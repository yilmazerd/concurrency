package com.example.concurrency;

public class BasicThread {
    public static void main(String[] args) {

        SomeClass someClass1 = new SomeClass();
        SomeClass someClass2 = new SomeClass();
        SomeClass someClass3 = new SomeClass();
        SomeClass someClass4 = new SomeClass();
        SomeClass someClass5 = new SomeClass();
        someClass1.start();
        someClass2.start();
        someClass3.start();
        someClass4.start();
        someClass5.start();

    }



}


class SomeClass extends Thread {
    @Override
    public void run(){
        System.out.println("Executing run method in some class, thread is: " + Thread.currentThread());
    }
}