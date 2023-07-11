package app;

import app.utils.Constants;
import app.utils.DataSupplier;
import app.utils.OperationsExecutor;
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
        OperationsExecutor<String, Integer> operationsExecutor = new OperationsExecutor<>();

        HashMap<String, Integer> fruits = DataSupplier.getFruits();
        System.out.println(Constants.INT_DATA);
        outputGetter.getMap(fruits, Constants.ROW_WITH_COMA);

        operationsExecutor.changeValue(fruits, "banana", 14);
        operationsExecutor.addValue(fruits, "plum", 15);
        System.out.println(Constants.UPDATED_DATA);
        outputGetter.getMap(fruits, Constants.ROW_WITH_COMA);
    }

    private static void  executeTaskTwo() {
        System.out.println("----------Task 2----------");

        OperationsExecutor<String, Integer> operationsExecutor = new OperationsExecutor<>();
        HashMap<String, Integer> fruits = DataSupplier.getFruits();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the key you want to found:");
        System.out.println(operationsExecutor.findKey(fruits, scanner.nextLine()));
    }

    private static void executeTaskThree() {
        System.out.println("----------Task 3----------");

        OutputGetter<String, String> outputGetter = new OutputGetter<>();
        OperationsExecutor<String, String> operationsExecutor = new OperationsExecutor<>();

        LinkedHashMap<String, String> contacts = DataSupplier.getContacts();
        System.out.println(Constants.INT_DATA);
        outputGetter.getMap(contacts, Constants.ROW_WITH_DASH);

        operationsExecutor.changeValue(contacts, "Tom", "tomasdev@glob.net");
        System.out.println(Constants.UPDATED_DATA);
        outputGetter.getMap(contacts, Constants.ROW_WITH_DASH);

    }
}
