package com.yxy.structure.util;

import java.util.HashMap;
import java.util.Map;

public class BinaryKeyMap<K1, K2, V> {

    private Map<K1, Map<K2, V>> map = new HashMap<>();

    public void put(K1 key1, K2 key2, V value) {
        Map<K2, V> innerMap = map.get(key1);
        if (innerMap == null) {
            innerMap = new HashMap<>();
            map.put(key1, innerMap);
        }
        //同一个service可以有不同的实现类，比如@ServiceProvider("another")注解
        innerMap.put(key2, value);
    }

    public V get(K1 key1, K2 key2) {
        Map<K2, V> innerMap = map.get(key1);
        if (innerMap == null) {
            return null;
        } else {
            return innerMap.get(key2);
        }
    }

}
