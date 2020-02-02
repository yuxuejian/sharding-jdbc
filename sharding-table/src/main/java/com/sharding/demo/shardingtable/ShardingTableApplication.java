package com.sharding.demo.shardingtable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ShardingTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingTableApplication.class, args);
    }

}
