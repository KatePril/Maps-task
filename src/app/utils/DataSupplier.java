package app.utils;

import java.util.HashMap;

public final class DataSupplier {

    public static HashMap<String, Integer> getFruits() {
        HashMap<String, Integer> fruits = new HashMap<>();
        fruits.put("orange", 12);
        fruits.put("banana", 25);
        fruits.put("lemon", 8);
        fruits.put("pineapple", 13);
        fruits.put("grape", 9);
        return fruits;
    }

}
