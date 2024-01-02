package org.example;

public class IntegerSumCalculator {

    private final Integer num1;
    private final Integer num2;

    IntegerSumCalculator(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void sumAndPrint() {
        System.out.println(num1 + num2);
    }
}
