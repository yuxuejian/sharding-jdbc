package com.sharding.demo.shardingdbtable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ShardingDbTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingDbTableApplication.class, args);
    }

}
