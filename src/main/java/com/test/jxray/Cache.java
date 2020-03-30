package com.test.jxray;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private final  List<String> cache1 = new ArrayList<>();
    private final  List<String> cache2 = new ArrayList<>();

    public void cache_first(){
        cache1.add(""+System.nanoTime());
    }

    public void cache_second(){
        cache2.add(""+System.nanoTime());
    }

}
