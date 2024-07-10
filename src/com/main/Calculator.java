package com.main;

import com.exceptions.DivideByZeroException;
import com.exceptions.InvalidOperationException;
import com.operations.Operation;

public class Calculator {

    public static void main(String[] args) {


        if (args.length != 3) {
            System.out.println("Incorrect number of arguments provided.");
            return;
        }

        String op = args[0].toUpperCase();
        double x = 0;
        double y = 0;

        try {
            x = Double.parseDouble(args[1]);
            y = Double.parseDouble(args[2]);

        } catch (NumberFormatException e) {
            System.out.println("The arguments must be numeric values.");
        }


        Operation operation = null;
        try {
            operation = Operation.valueOf(op);
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal operation passed. Use sum, subtract, divide or multiply.");
        }

        try {
            double result = operation.aplicar(x, y);
            System.out.println("Result: " + result);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        } catch (InvalidOperationException e) {
            System.out.println(e);
        }

    }
}