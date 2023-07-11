package app.utils;

import java.util.HashMap;
import java.util.LinkedHashMap;

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

    public static LinkedHashMap<String, String> getContacts() {
        LinkedHashMap<String, String> contacts = new LinkedHashMap<>();
        contacts.put("Tom", "tom@mail.com");
        contacts.put("Lisa", "lisa@mail.com");
        contacts.put("Alice", "alisa@mail.com");
        contacts.put("Denis", "den@mail.com");
        return contacts;
    }

}
