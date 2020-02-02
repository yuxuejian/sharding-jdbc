package com.sharding.demo.shardingdbtable.config;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

public class DbPreciseAlgorithmConfig implements PreciseShardingAlgorithm<Long> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        for (String tableName : collection) {
            long code = preciseShardingValue.getValue() % 4;
            int num = 0;
            // 分库依据范围（0和1分到库0；2和3分到库1）
            if (code > 1) num = 1;
            if (tableName.endsWith(num + "")) {
                System.out.println("数据库名称："+tableName);
                return tableName;
            }
        }
        throw new IllegalArgumentException();
    }
}
