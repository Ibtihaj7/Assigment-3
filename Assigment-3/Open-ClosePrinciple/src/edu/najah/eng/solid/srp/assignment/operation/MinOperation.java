package edu.najah.eng.solid.srp.assignment.operation;

import edu.najah.eng.solid.srp.assignment.Calculator;


public class MinOperation implements GeneralCalculate{
    @Override
    public int calculate(Calculator calculator) {
        int min = Integer.MAX_VALUE;
        for (Integer number : calculator.getNumbers()) {
            if (min > number){
                min = number;
            }
        }
        return min;
    }
}
