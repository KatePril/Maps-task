package app.operators;

import java.util.Map;

public class ElementReplacer<K, V> {

    public V changeValue(
            Map<K, V> map, K key, V value) {
        return map.replace(key, value);
    }
}
