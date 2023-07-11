package app;

import app.utils.DataSupplier;
import app.utils.OperationsExecutor;
import app.utils.OutputGetter;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        executeTaskOne();
    }

    private static void executeTaskOne() {
        HashMap<String, Integer> fruits = DataSupplier.getFruits();
        System.out.println("Initial data:");
        OutputGetter.getMap(fruits);
        OperationsExecutor.changeValue(fruits, "banana", 14);
        OperationsExecutor.addValue(fruits, "plum", 15);
        System.out.println("Updated data:");
        OutputGetter.getMap(fruits);
    }
}
