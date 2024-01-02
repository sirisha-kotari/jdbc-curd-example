package org.example;

public class SumCalculator<T extends Number> {
    T num1;
    T num2;

    SumCalculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void sumAndPrint() {
        System.out.println(num1.doubleValue() +num2.doubleValue());
    }
}
