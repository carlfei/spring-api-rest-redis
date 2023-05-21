package org.example.config;


import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;


@Configuration
@EnableRedisRepositories
@EnableCaching
public class RedisConfig {
    @Bean
    public JedisConnectionFactory redisConnectionFactory() {
        RedisProperties properties = new RedisProperties();
        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration(properties.getHost(), properties.getPort());
        return new JedisConnectionFactory(config);
    }
}

