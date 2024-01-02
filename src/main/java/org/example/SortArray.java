package org.example;

import java.util.Arrays;

public class SortArray {

    private void sortArray(int[] array) {


        for (int i = 0; i < array.length-1 ; i++) {
            if (array[i] > array[i+1]) {
                int temp = array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
                i=-1;
            }
        }


    }



    public static void main(String[] args){

        int[] array=new int[]{11,10,-10,12,9,5,1};

        SortArray array1=new SortArray();
        array1.sortArray(array);
System.out.println(Arrays.toString(array));
    }


}
