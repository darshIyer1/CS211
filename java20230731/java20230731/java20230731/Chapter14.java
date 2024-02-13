// Name: Darsh Iyer
// Date: 12 February, 2024
// Course: CS211 11490 - W24 - Fundamentals of CS II
// References used: Github

package java20230731.java20230731.java20230731;

import java.util.*;

public class Chapter14 {
    public static Stack<CalendarDate> stutter(Stack<CalendarDate> s) {
        Queue<CalendarDate> q = new LinkedList<>();
        Stack<CalendarDate> result = new Stack<>();

        while (!s.empty()) {
            CalendarDate date = s.pop();
            q.add(date);
            q.add(date);
        }

        while (!q.isEmpty()) {
            result.push(q.remove());
        }

        return result;
    }

    public static boolean equals(Stack<CalendarDate> s1, Stack<CalendarDate> s2) {
        if (s1.size() != s2.size()) {
            return false;
        }
    
        Queue<CalendarDate> q1 = new LinkedList<>();
        Queue<CalendarDate> q2 = new LinkedList<>();
        boolean areEqual = true;
    
        while (!s1.empty() && !s2.empty()) {
            CalendarDate date1 = s1.pop();
            CalendarDate date2 = s2.pop();
    
            if (!date1.equals(date2)) {
                areEqual = false;
            }
    
            q1.add(date1);
            q2.add(date2);
        }
    
        while (!q1.isEmpty()) {
            s1.push(q1.remove());
        }
    
        while (!q2.isEmpty()) {
            s2.push(q2.remove());
        }
    
        return areEqual;
    }

    public static boolean isSorted(Stack<CalendarDate> s) {
        if (s.empty()) {
            return true;
        }
    
        Queue<CalendarDate> q = new LinkedList<>();
        boolean isSorted = true;
        CalendarDate prevDate = s.pop();
        q.add(prevDate);
    
        while (!s.empty()) {
            CalendarDate currentDate = s.pop();
            if (currentDate.compareTo(prevDate) > 0) {
                isSorted = false;
            }
            q.add(currentDate);
            prevDate = currentDate;
        }
    
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    
        return isSorted;
    }

    public static void mergeSorted(Stack<CalendarDate> s1, Stack<CalendarDate> s2) {
        Queue<CalendarDate> q = new LinkedList<>();
    
        while (!s1.empty() && !s2.empty()) {
            if (s1.peek().compareTo(s2.peek()) <= 0) {
                q.add(s1.pop());
            } else {
                q.add(s2.pop());
            }
        }
    
        while (!s1.empty()) {
            q.add(s1.pop());
        }
    
        while (!s2.empty()) {
            q.add(s2.pop());
        }
    
        while (!q.isEmpty()) {
            s1.push(q.remove());
        }
    } 

    public static void removeMin(Stack<CalendarDate> s) {
        Queue<CalendarDate> q = new LinkedList<>();
        CalendarDate min = s.peek();
    
        while (!s.empty()) {
            CalendarDate current = s.pop();
            if (current.compareTo(min) < 0) {
                min = current;
            }
            q.add(current);
        }
    
        boolean foundMin = false;
        while (!q.isEmpty()) {
            CalendarDate current = q.remove();
            if (!foundMin && current.equals(min)) {
                foundMin = true;
            } else {
                s.push(current);
            }
        }
    }

    public static void main(String[] args) {
        Stack<CalendarDate> stack1 = new Stack<>();
        Stack<CalendarDate> stack2 = new Stack<>();

        stack1.push(new CalendarDate(2022, 1, 1));
        stack1.push(new CalendarDate(2022, 2, 2));
        stack1.push(new CalendarDate(2022, 3, 3));

        stack2.push(new CalendarDate(2022, 1, 15));
        stack2.push(new CalendarDate(2022, 2, 15));
        stack2.push(new CalendarDate(2022, 3, 15));

        System.out.println("Is stack1 sorted? " + isSorted(stack1));
        System.out.println("Is stack2 sorted? " + isSorted(stack2));

        mergeSorted(stack1, stack2);

        System.out.println("After merging, is stack1 sorted? " + isSorted(stack1));
    }
}
