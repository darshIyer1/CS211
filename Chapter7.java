// Name: Darsh Iyer
// Date: 7 November, 2023 (Don't mind the date of the package, it's a package I've been using to write java code since I started a online course in end of July)
// Course: CS210 13391 - F23 - Fundamentals of CS I FALL 2023
// References used: github

package java20230731;

import java.util.Arrays;
import java.util.HashMap;

public class Chapter7 {
    public static void main(String[] args) {
        isSorted(new int[] {11, 12, 13, 14, 15});

        mode(new int[] {21, 22, 23, 24, 25});

        median(new int[] {31, 32, 33, 34, 35});

        percentEven(new int[] {41, 42, 43, 44, 45});

        longestSortedSequence(new int[] {51, 52, 53, 54, 55});
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int mode(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int mode = array[0];
       
        int max = 0;

        for (int num : array) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            if (count > max) {
                max = count;
                mode = num;
            }
        }

        return mode;
    }


    public static double median(int[] array) {
        int[] copy = new int[array.length];
        
        System.arraycopy(array, 0, copy, 0, array.length);
        
        Arrays.sort(copy);
        
        int middle = copy.length / 2;

        if (copy.length % 2 == 1) {
            return copy[middle];
        }
        else {
            return (copy[middle - 1] + copy[middle]) / 2.0;
        }

    }

    public static double percentEven(int[] array) {
        if (array.length == 0) {
            return 0.0;
        }

        int evenCount = 0;
        
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        return 100.0 * evenCount / array.length;
    }

    public static int[] longestSortedSequence(int[] array) {
        int longest = 0;
        
        int start = 0;
        
        
        for (int i = 0; i < array.length; i++) {
            int current = 1;
            
            int currentStart = i;
            
            while (i + 1 < array.length && array[i] <= array[i + 1]) {
                current++;
                i++;
            }
            
            if (current > longest) {
                longest = current;
                start = currentStart;
            }
        }
        
        int[] result = new int[longest];
        
        for (int i = 0; i < longest; i++) {
          result[i] = array[start + i];
        }
        
        return result;
      }
}
