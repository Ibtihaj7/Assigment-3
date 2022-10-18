package edu.najah.eng.solid.srp.assignment.operation;

import edu.najah.eng.solid.srp.assignment.Calculator;


public class CountOperation implements GeneralCalculate{
    @Override
    public int calculate(Calculator calculator) {
        return calculator.getNumbers().size();
    }
}
