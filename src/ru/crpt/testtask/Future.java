package ru.crpt.testtask;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Future<K,V> {

    private ConcurrentHashMap<K,V> cache = new ConcurrentHashMap<>();

    public  V compute(K k, Function<K, V> f){
        return cache.computeIfAbsent(k,f);
    }
}

