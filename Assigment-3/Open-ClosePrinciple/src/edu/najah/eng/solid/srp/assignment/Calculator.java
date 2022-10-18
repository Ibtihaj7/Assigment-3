package edu.najah.eng.solid.srp.assignment;

import edu.najah.eng.solid.srp.assignment.operation.*;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> numbers = null;
    public Calculator(){
        numbers = new ArrayList<>();
    }
    public ArrayList<Integer> getNumbers() {
        return numbers;
    }
    public void addNumber(int number){
        numbers.add(number);
    }
    public void removeNumberAtIndex(int index){
        if (index < 0 || index >= numbers.size()){
            System.out.println("Invalid number: " + index);
            return;
        }
        numbers.remove(index);
    }

    public int getOperationResult(Operation operation){
        switch (operation){
            case Count:
                GeneralCalculate count = new CountOperation();
                return count.calculate(this);
            case Addition:
                GeneralCalculate addition = new AdditionOperation();
                return addition.calculate(this);
            case Multiplication:
                GeneralCalculate multiplication = new MultiplicationOperation();
                return multiplication.calculate(this);
            case Max:
                GeneralCalculate max = new MaxOperation();
                return max.calculate(this);
            case Min:
                GeneralCalculate min = new MinOperation();
                return min.calculate(this);
        }
        System.err.println("Invalid operation");
        return -1111111;
    }
}
