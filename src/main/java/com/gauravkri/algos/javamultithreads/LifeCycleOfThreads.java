package com.gauravkri.algos.javamultithreads;


import java.security.PublicKey;

class Test implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(1500);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("State of thread while it called join() method on other thread -"+ LifeCycleOfThreads.thread1.getState());

        try{
            Thread.sleep(200);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class LifeCycleOfThreads implements Runnable {
    public static Thread thread1;
    public static LifeCycleOfThreads obj;


    public static void main(String[] args) {
        obj = new LifeCycleOfThreads();
        thread1 = new Thread(obj);

        System.out.println("State of Thread1 after creating- "+ thread1.getState());

        thread1.start();
        System.out.println("State of Thread1 after starting- "+ thread1.getState());

    }
    @Override
    public void run() {

        Test test = new Test();
        Thread thread2 = new Thread(test);
        System.out.println("State of Thread2 after creating- "+ thread2.getState());

        thread2.start();
        System.out.println("State of Thread2 after starting- "+ thread2.getState());

        try{
            Thread.sleep(200);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("State of Thread2 after sleep- "+ thread2.getState());

        try {
            thread2.join();;
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("State of Thread2 after finished execution- "+ thread2.getState());

    }
}
