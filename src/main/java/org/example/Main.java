package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)  {

        DoubleSumCalculator doubleSumCalculator1 = new DoubleSumCalculator(200.3,400.3);
        try {
            doubleSumCalculator1.sumAndPrint();
        } catch (CalculationException e) {
            System.out.println(e.getMessage());
        }

        //It won't run from here
        SumCalculator<Double> doubleSumCalculator = new SumCalculator<>(30.4, 56.7);
        doubleSumCalculator.sumAndPrint();

        SumCalculator<Integer> integerSumCalculator = new SumCalculator<>(30, 56);
        integerSumCalculator.sumAndPrint();
    }

    private static void printStudents(List<Student> students) {
        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}