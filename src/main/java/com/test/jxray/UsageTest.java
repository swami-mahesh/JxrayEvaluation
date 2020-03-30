package com.test.jxray;

public class UsageTest {

    private final Cache cache = new Cache();
    private final Service1 ser1 = new Service1(cache);
    private final Service2 ser2 = new Service2(cache);

    private final Runnable serve1  = () -> {while(true) ser1.serve();};
    private final Runnable serve2  = () -> {while(true) ser2.serve();};


    public static void main(String[] args) {
        UsageTest test = new UsageTest();
        Thread t1 = new Thread(test.serve1, "Thread-Service-1");
        Thread t2 = new Thread(test.serve2, "Thread-Service-2");
        t1.start();
        t2.start();
    }


}
