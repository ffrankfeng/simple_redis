package com.simple_redis.cache;

public final class CacheBs<K, V> {
    private CacheBs(){}

    public static <K, V> CacheBs<K, V> newInstance(){
        return new CacheBs<K, V>();
    }

    private int size = Integer.MAX_VALUE;

    private ICacheEvict<K,V> evict = CacheEvicts.fifo();
}
