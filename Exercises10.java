// Name: Darsh Iyer
// Date: 15 January, 2024
// Course: CS211 11490 - W24 - Fundamentals of CS II
// References used: Github

import java.util.*;

public class Exercises10
{
    public static void main(String[] alot587) {
	    
        // Initialize an array of Strings, then load into a String List:
        String[] arrayS = {"four", "score", "and", "seven", "years", "ago"};
        ArrayList<String> testListS = new ArrayList<String>(); 
        ArrayList<String> testListSempty = new ArrayList<String>();
        for (String s: arrayS) testListS.add(s);
        
        // Use Iverson's CalendarDate, so we MUST use compareTo concept
        ArrayList<CalendarDate> testListC = new ArrayList<CalendarDate>();
        ArrayList<CalendarDate> testListCempty = new ArrayList<CalendarDate>();
        testListC.add(new CalendarDate(10,12,1314));  
        testListC.add(new CalendarDate(2,14,2022));  testListC.add(new CalendarDate(3,21,2022)); testListC.add(new CalendarDate(10,12,1314));
         
        // Exercise 10.2
        System.out.println(testListS);
        swapPairs(testListS);
        swapPairs(testListSempty);
        System.out.println("10.2 swapPairs: "+ testListS); 
        System.out.println();
        
        // Exercise 10.6
        System.out.println(testListC);
        minToFront(testListC);
        minToFront(testListCempty);
        System.out.println("10.6 minToFront: " + testListC);
        System.out.println();
        
        // Exercise 10.7
        System.out.println(testListC);
        removeDuplicatesNew(testListC);
        removeDuplicatesNew(testListCempty);
        System.out.println("10.7 removeDuplicates: " + testListC);
        System.out.println();
        
        // Exercise 10.12
        System.out.println(testListS);
        markLength4(testListS);
        markLength4(testListSempty);
        System.out.println("10.12 markLength4: " + testListS);
        System.out.println();
    
        // Exercise 10.18
        System.out.println(testListS);
        mirrorNew(testListS);
        mirrorNew(testListSempty);
        System.out.println("10.18 mirror: " + testListS);
        System.out.println();
    }

    public static void swapPairs(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            String temp = list.get(i); // temporary variable
            
            list.set(i, list.get(i + 1)); //replace first element with second element
            
            list.set(i + 1, temp); // replace next element with variable value
        }
    }

    public static void minToFront(ArrayList<CalendarDate> list) {
        if(list.isEmpty()) {
            return;
        }
        int minIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(list.get(minIndex)) < 0) {
                minIndex = i; // assume first element is the minimum
            }
        }
        
        CalendarDate minValue = list.remove(minIndex); // remove minimum value
        
        list.add(0, minValue); // add minimum value to  front
    }

    public static void removeDuplicates(ArrayList<CalendarDate> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) { // remove duplicate element
                list.remove(i);
                // going back to avoid skips
                i--;
            }
        }
    }

    public static void removeDuplicatesNew(ArrayList<CalendarDate> list) {
        ArrayList<CalendarDate> result = new ArrayList<>(); // creates empty list
        for (int i = 0; i < list.size(); i++) {
            if(!result.contains(list.get(i))) {
                result.add(list.get(i));
            }        
        }
        list.clear();
        list.addAll(result);
    }

    public static void markLength4(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                list.add(i, "****"); //adds 4 asterisks if string length is 4
                
                i++;
            }
        }
    }

    public static void mirror(ArrayList<String> list) {
        ArrayList<String> copy = new ArrayList<>(list); // copying list
        
        Collections.reverse(copy); // reversing list
        
        list.addAll(copy); // adding copied reversed list to original 
    }

    /*
Write a method mirror that accepts an ArrayList of Strings 
as a parameter and produces a mirrored copy of the list as 
output, with the original values followed by those same 
values in the opposite order. For example, if an ArrayList 
variable called list contains the values ["a", "b", "c"], 
after a call of mirror(list); it should contain 
["a", "b", "c", "c", "b", "a"]. */

/*Define a public static method named mirror 
that takes an ArrayList of Strings as a 
parameter and returns an ArrayList of Strings as well.

Create a new ArrayList of Strings to store the 
mirrored copy of the list.

Use a for loop to iterate over the 
original list from the last element 
to the first element.

For each element, use the add 
method to append it to the new list.

Use the addAll method to append the original list to the new list.

Return the new list as the output of the method. */
    public static void mirrorNew(ArrayList<String> list) {
        ArrayList<String> copy = new ArrayList<>(); // create new empty list
        

        for (int i = list.size()-1; i >= 0; i--) {
            copy.add(list.get(i));

        }
        list.clear();
        list.addAll(copy); // adding copied reversed list to original 
    }
}