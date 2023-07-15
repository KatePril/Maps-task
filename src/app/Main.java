package app;

import app.operators.ElementAdder;
import app.operators.ElementFinder;
import app.operators.ElementReplacer;
import app.utils.Constants;
import app.provider.DataSupplier;
import app.utils.OutputGetter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        executeTaskOne();
        executeTaskTwo();
        executeTaskThree();
    }

    private static void executeTaskOne() {
        System.out.println("----------Task 1----------");

        OutputGetter<String, Integer> outputGetter = new OutputGetter<>();
        ElementReplacer<String, Integer> elementReplacer = new ElementReplacer<>();
        ElementAdder<String, Integer> elementAdder = new ElementAdder<>();

        HashMap<String, Integer> fruits = DataSupplier.getFruits();
        System.out.println(Constants.INT_DATA);
        outputGetter.getMap(fruits, Constants.ROW_WITH_COMA);

        elementReplacer.changeValue(fruits, "banana", 14);
        elementAdder.addValue(fruits, "plum", 15);
        System.out.println(Constants.UPDATED_DATA);
        outputGetter.getMap(fruits, Constants.ROW_WITH_COMA);
    }

    private static void  executeTaskTwo() {
        System.out.println("----------Task 2----------");

        ElementFinder<String, Integer> elementFinder = new ElementFinder<>();
        HashMap<String, Integer> fruits = DataSupplier.getFruits();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the key you want to found:");
        System.out.println(elementFinder.findKey(fruits, scanner.nextLine()));
    }

    private static void executeTaskThree() {
        System.out.println("----------Task 3----------");

        OutputGetter<String, String> outputGetter = new OutputGetter<>();
        ElementReplacer<String, String> elementReplacer = new ElementReplacer<>();

        LinkedHashMap<String, String> contacts = DataSupplier.getContacts();
        System.out.println(Constants.INT_DATA);
        outputGetter.getMap(contacts, Constants.ROW_WITH_DASH);

        elementReplacer.changeValue(contacts, "Tom", "tomasdev@glob.net");
        System.out.println(Constants.UPDATED_DATA);
        outputGetter.getMap(contacts, Constants.ROW_WITH_DASH);

    }
}
