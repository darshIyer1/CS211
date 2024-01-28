// Name: Darsh Iyer
// Date: 23 January, 2024
// Course: CS211 11490 - W24 - Fundamentals of CS II
// References used: None

import java.util.*;

public class Quiz11 {
    public static void main(String[] args88) {
        ArrayList<CalendarDate> list1 = new ArrayList<CalendarDate>(737);
        System.out.println(yearMode(list1)); // 0 is returned when list is empty
        
        list1.add(new CalendarDate(5, 5, 2018));
        
        list1.add(new CalendarDate(1, 2, 2018));
        
        list1.add(new CalendarDate(5, 5, 2018));
        
        list1.add(new CalendarDate(10, 7, 1907));
        
        list1.add(new CalendarDate(5, 5, 2018));
        
        System.out.println(yearMode(list1));
    }

    public static int yearMode(List<CalendarDate> quiz) {
        Map<Integer, Integer> yearFrequency = new HashMap<>();

        for (CalendarDate date : quiz) {
            int year = date.getYear();
            if (yearFrequency.containsKey(year)) {
                yearFrequency.put(year, yearFrequency.get(year) + 1);
            } else {
                yearFrequency.put(year, 1);
            }
        }

        int maxFrequency = 0;
        
        for (int frequency : yearFrequency.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        return maxFrequency;
    }
}
