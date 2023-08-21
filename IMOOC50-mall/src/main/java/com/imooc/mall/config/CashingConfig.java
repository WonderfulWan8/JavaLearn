package com.imooc.mall.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;

/**
 * 描述：     缓存配置类
 */
@Configuration
@EnableCaching
/**
 * Redis缓存配置类。
 */
public class CashingConfig {

    /**
     * 创建一个Redis缓存管理器，使用默认缓存配置和30秒的缓存过期时间。
     *
     * @param connectionFactory Redis连接工厂
     * @return Redis缓存管理器
     */
    public RedisCacheManager redisCacheManager(RedisConnectionFactory connectionFactory){
        // 创建一个Redis缓存写入器，使用锁定机制
        RedisCacheWriter redisCacheWriter = RedisCacheWriter.lockingRedisCacheWriter(connectionFactory);
        // 获取默认缓存配置，并将缓存过期时间设置为30秒
        RedisCacheConfiguration cacheConfiguration = RedisCacheConfiguration.defaultCacheConfig();
        cacheConfiguration = cacheConfiguration.entryTtl(Duration.ofSeconds(30));
        // 创建一个Redis缓存管理器，使用缓存写入器和配置
        RedisCacheManager redisCacheManager = new RedisCacheManager(redisCacheWriter,cacheConfiguration);
        // 返回Redis缓存管理器
        return redisCacheManager;
    }
}