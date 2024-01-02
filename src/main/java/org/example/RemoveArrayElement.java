package org.example;

import java.util.Arrays;

public class RemoveArrayElement {

    public int[] removeArrayElement(int[] array, int element) {
        int index = 0;
        int[] newArray = new int[]{10, 20, 30,50};
        for (int i = 0; i <array.length; i++) {
            if (array[i] != element) {
                newArray[index] = array[i]; //10
                index++;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {

        int[] myArray = new int[]{10, 20, 30, 40, 50};
        RemoveArrayElement ram = new RemoveArrayElement();
        int[] newArray = ram.removeArrayElement(myArray, 40);

        System.out.println("my new Array: " + Arrays.toString(newArray));
    }


}
