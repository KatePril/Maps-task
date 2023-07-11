package app;

import app.utils.Constants;
import app.utils.DataSupplier;
import app.utils.OperationsExecutor;
import app.utils.OutputGetter;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        executeTaskOne();
    }

    private static void executeTaskOne() {
        OutputGetter<String, Integer> outputGetter = new OutputGetter<>();
        OperationsExecutor<String, Integer> operationsExecutor = new OperationsExecutor<>();

        HashMap<String, Integer> fruits = DataSupplier.getFruits();
        System.out.println("Initial data:");
        outputGetter.getMap(fruits, Constants.ROW_WITH_COMA);

        operationsExecutor.changeValue(fruits, "banana", 14);
        operationsExecutor.addValue(fruits, "plum", 15);
        System.out.println("Updated data:");
        outputGetter.getMap(fruits, Constants.ROW_WITH_COMA);
    }

    private static void executeTaskThree() {
//        OutputGetter<String, String> outputGetter = new OutputGetter<>();
//        OperationsExecutor<String, String> operationsExecutor = new OperationsExecutor<>();
//
//        LinkedHashMap<String, String> contacts = DataSupplier
    }
}
