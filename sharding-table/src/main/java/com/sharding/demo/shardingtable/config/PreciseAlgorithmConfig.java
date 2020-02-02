package com.sharding.demo.shardingtable.config;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

public class PreciseAlgorithmConfig implements PreciseShardingAlgorithm<Long> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        for (String tableName : collection) {
            if (tableName.endsWith(preciseShardingValue.getValue() % 2 + "")) {
                System.out.println("表名："+tableName);
                return tableName;
            }
        }
        throw new IllegalArgumentException();
    }
}
