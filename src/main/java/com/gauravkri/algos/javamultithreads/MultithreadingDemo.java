package com.gauravkri.algos.javamultithreads;

class Multithreading extends Thread {

    public void run(){
        try{
            System.out.println("Thread "+ Thread.currentThread().getId() + " is running");
        }catch (Exception e){
            System.out.println("Exception caught");
        }
    }
}

class MultithreadingByRunnable implements Runnable{

    @Override
    public void run() {
        try{
            System.out.println("Thread Implementing Runnable "+ Thread.currentThread().getId() + " is running");
        }catch (Exception e){
            System.out.println("Exception caught");
        }
    }
}
public class MultithreadingDemo {

    public static void main(String[] args) {
        int n =10;

        while (n > 1){
            Multithreading object = new Multithreading();
            object.start();

            Thread object2 = new Thread(new MultithreadingByRunnable());
            object2.start();
            n--;
        }
    }
}