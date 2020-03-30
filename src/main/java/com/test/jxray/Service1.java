package com.test.jxray;

public class Service1 {

    private final Cache cache;

    public Service1(Cache cache) {
        this.cache = cache;
    }

    public void serve() {
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            cache.cache_first();
        }
}
