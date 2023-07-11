package app.utils;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;

public class OutputGetter<K, V> {

    public void getMap(Map<K, V> map, String row) {
        int count = 1;
        StringBuilder output = new StringBuilder();
        for (Map.Entry<K, V> pair : map.entrySet()) {
            output.append(format(row,
                    count, pair.getKey(), pair.getValue()));
            count++;
        }
        System.out.println(output);
    }
}
