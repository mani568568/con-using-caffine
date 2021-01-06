package com.mg.connect2caffine.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * Similar to the cache configuration in application.properties
 */

@Configuration
public class CacheConfig {

    public CacheManager cacheManager()
    {
        CaffeineCacheManager caffeineCacheManager = new CaffeineCacheManager("user");
        caffeineCacheManager.setCaffeine(caffeineCacheBuilder());
        return caffeineCacheManager;
    }


    Caffeine<Object,Object> caffeineCacheBuilder()
    {
        return Caffeine.newBuilder().initialCapacity(100)
                .maximumSize(500)
                .expireAfterAccess(10, TimeUnit.MINUTES)
                .weakKeys()
                .recordStats();
    }
}