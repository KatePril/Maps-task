package app.operators;

import java.util.Map;

import static java.lang.String.format;

public class ElementFinder<K, V> {
    public String findKey(Map<K, V> map, K key) {
        for (K k : map.keySet()) {
            if (k.equals(key)) {
                return format("%s was found", key);
            }
        }
        return format("%s is absent", key);
    }
}
