// Name: Darsh Iyer
// Date: 9 November 2023
// Course: CS210 13391 - F23 - Fundamentals of CS I FALL 2023
// References used: none

package java20230731;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

public class Quiz7 {
    public static void main(String[] args85) {
        int[] list1 = {1, 87, 1, -1, 0, -1, 22};
        int[] list2 = {1, 11, 12, 13, 22, 35, 3};
        int[] list3 = {};

        System.out.println(Arrays.toString(omitNegatives(list1)));
        System.out.println(Arrays.toString(omitNegatives(list2)));
        System.out.println(Arrays.toString(omitNegatives(list3)));
    }

    public static int[] omitNegatives(int[] array) {
        List<Integer> positiveValues = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
            positiveValues.add(array[i]);
            }
        }

        int[] positiveArray = new int[positiveValues.size()];
  
        for (int i = 0; i < positiveArray.length; i++) {
            positiveArray[i] = positiveValues.get(i);
        }

        return positiveArray;
    }
}
