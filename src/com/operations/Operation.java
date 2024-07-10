package com.operations;

import com.exceptions.DivideByZeroException;
import com.exceptions.InvalidOperationException;

public enum Operation {
    SUM,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;

    public double aplicar(double x, double y) throws InvalidOperationException, DivideByZeroException {
        switch(this) {
            case SUM:
                return x + y;
            case SUBTRACT:
                return x - y;
            case MULTIPLY:
                return x * y;
            case DIVIDE:
                if(y != 0) {
                    return x / y;
                } else {
                    throw new DivideByZeroException("The second parameter in the division cannot be 0.");
                }
            default:
                throw new InvalidOperationException("Operation not supported.");
        }
    }
}