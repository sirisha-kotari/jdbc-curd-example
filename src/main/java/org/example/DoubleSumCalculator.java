package org.example;

public class DoubleSumCalculator {
    private final Double num1;
    private final Double num2;

    DoubleSumCalculator(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void sumAndPrint() {
        if (num1 > 100) {
            throw new CalculationException("Number can't be greater than 100");
        }
        System.out.println(num1 + num2);
    }
}
