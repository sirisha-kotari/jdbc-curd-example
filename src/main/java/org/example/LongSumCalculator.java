package org.example;

public class LongSumCalculator {

    private final Long num1;
    private final Long num2;

    LongSumCalculator(Long num1, Long num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void sumAndPrint() {
        System.out.println(num1 + num2);
    }
}
