package com.gauravkri.algos.javamultithreads;

public class ThreadsPriority implements Runnable{

    public void run(){
        System.out.println("inside run method");
    }

    public static void main(String[] args) {
        ThreadsPriority tp1 = new ThreadsPriority();
        Thread t1 = new Thread(tp1);
        ThreadsPriority tp2 = new ThreadsPriority();
        Thread t2 = new Thread(tp2);
        ThreadsPriority tp3 = new ThreadsPriority();
        Thread t3 = new Thread(tp3);
        System.out.println(" t1 thread priority "+ t1.getPriority());
        System.out.println(" t2 thread priority "+ t2.getPriority());
        System.out.println(" t3 thread priority "+ t3.getPriority());

        t1.setPriority(3);
        t2.setPriority(2);
        t3.setPriority(8);

        System.out.println(" t1 thread priority "+ t1.getPriority());
        System.out.println(" t2 thread priority "+ t2.getPriority());
        System.out.println(" t3 thread priority "+ t3.getPriority());


    }
}
