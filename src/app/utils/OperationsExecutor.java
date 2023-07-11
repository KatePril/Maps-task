package app.utils;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;

public final class OperationsExecutor {

    public static Integer changeValue(
            HashMap<String, Integer> hashMap, String key, Integer value) {
        return hashMap.replace(key, value);
    }

    public static void addValue(
            HashMap<String, Integer> hashMap, String key, Integer value) {
        hashMap.put(key, value);
    }
}
