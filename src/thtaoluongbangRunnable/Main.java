package thtaoluongbangRunnable;

import thtaoluongbangRunnable.RunnableDemo;

public class Main {

    public static void main(String[] args) {
        System.out.println("thtaoluongbangRunnable.Main thread running...");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo2.start();

        System.out.println("thtaoluongbangRunnable.Main thread stopped!!!");
    }
}
