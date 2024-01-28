// Name: Darsh Iyer
// Date: 15 January, 2024
// Course: CS211 11490 - W24 - Fundamentals of CS II
// References used: None

import java.util.ArrayList;
import java.util.Iterator;

public class Quiz10 {
    public static void main(String[] a473) {
        ArrayList<CalendarDate> dates = new ArrayList<CalendarDate>(565);
        
        dates.add(new CalendarDate(5, 5, 2018));
        
        dates.add(new CalendarDate(10, 5, 2018));
        
        dates.add(new CalendarDate(5, 7, 2017));
        
        dates.add(new CalendarDate(10, 5, 2020));
        
        System.out.println("Before: " + dates); 
        
        removeOddMonths(dates);
        
        System.out.println(" After: " + dates); 
    }
    
    public static void removeOddMonths(ArrayList<CalendarDate> dates) {
        Iterator<CalendarDate> iterator = dates.iterator();
        
        while (iterator.hasNext()) {
            CalendarDate date = iterator.next();
        
            if (date.getMonth() % 2 != 0) {
                iterator.remove();
            }
        }
    }
}
