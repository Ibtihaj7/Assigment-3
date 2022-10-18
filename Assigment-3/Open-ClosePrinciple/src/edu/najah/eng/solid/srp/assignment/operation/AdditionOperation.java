package edu.najah.eng.solid.srp.assignment.operation;

import edu.najah.eng.solid.srp.assignment.Calculator;

public class AdditionOperation implements GeneralCalculate{
    @Override
    public int calculate(Calculator calculator) {
        int result = 0;
        for (Integer number : calculator.getNumbers()) {
            result += number;
        }
        return result;
    }
}
