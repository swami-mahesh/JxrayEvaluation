package com.test.jxray;

public class Service2 {

    private final Cache cache;

    public Service2(Cache cache) {
        this.cache = cache;
    }

    public void serve() {
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            cache.cache_second();
    }
}
