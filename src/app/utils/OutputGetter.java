package app.utils;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;

public class OutputGetter {

    public static void getMap(HashMap<String, Integer> map) {
        int count = 1;
        StringBuilder output = new StringBuilder();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            output.append(format("%d) %s, %d kg%n",
                    count, pair.getKey(), pair.getValue()));
            count++;
        }
        System.out.println(output);
    }
}
