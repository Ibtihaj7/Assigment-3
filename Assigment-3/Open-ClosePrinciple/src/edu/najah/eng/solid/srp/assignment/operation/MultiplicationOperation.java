package edu.najah.eng.solid.srp.assignment.operation;

import edu.najah.eng.solid.srp.assignment.Calculator;


public class MultiplicationOperation implements GeneralCalculate{
    @Override
    public int calculate(Calculator calculator) {
        int result = 1;
        for (Integer number : calculator.getNumbers()) {
            result *= number;
        }
        return result;
    }
}
