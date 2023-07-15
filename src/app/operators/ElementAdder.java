package app.operators;

import java.util.Map;

public class ElementAdder<K, V> {

    public void addValue(
            Map<K, V> map, K key, V value) {
        map.put(key, value);
    }
}
