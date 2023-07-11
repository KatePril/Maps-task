package app.utils;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;

public class OperationsExecutor<K, V> {

    public V changeValue(
            Map<K, V> map, K key, V value) {
        return map.replace(key, value);
    }

    public void addValue(
            Map<K, V> map, K key, V value) {
        map.put(key, value);
    }
}
