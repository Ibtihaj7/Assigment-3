package edu.najah.eng.solid.srp.assignment.operation;

import edu.najah.eng.solid.srp.assignment.Calculator;

public class MaxOperation  implements GeneralCalculate {

    @Override
    public int calculate(Calculator calculator) {
        int max = Integer.MIN_VALUE;

        for (Integer number : calculator.getNumbers()) {
            if (max < number){
                max = number;
            }
        }
        return max;
    }
}
