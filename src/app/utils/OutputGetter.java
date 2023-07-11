package app.utils;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;

public class OutputGetter {

    public static void getMap(HashMap<String, Integer> map, String row) {
        int count = 1;
        StringBuilder output = new StringBuilder();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            output.append(format(row,
                    count, pair.getKey(), pair.getValue()));
            count++;
        }
        System.out.println(output);
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
