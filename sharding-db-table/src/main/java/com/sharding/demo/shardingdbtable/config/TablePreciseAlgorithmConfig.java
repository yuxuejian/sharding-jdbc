package com.sharding.demo.shardingdbtable.config;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

public class TablePreciseAlgorithmConfig implements PreciseShardingAlgorithm<Long> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        for (String tableName : collection) {
            if (tableName.endsWith(preciseShardingValue.getValue() % 4 + "")) {
                System.out.println("表名："+tableName);
                return tableName;
            }
        }
        throw new IllegalArgumentException();
    }
}
