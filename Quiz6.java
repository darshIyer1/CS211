// Name: Darsh Iyer
// Date: 2 November, 2023
// Course: CS210 13391 - F23 - Fundamentals of CS I FALL 2023
// References used: none

package java20230731;

// CS210, Fall 2023
import java.io.*;
import java.util.*;

public class Quiz6 {
    public static void main(String[] args42) throws FileNotFoundException {
        File what = new File("whatever.txt"); // any file will work
        
        Scanner ever = new Scanner(what);
        
        System.out.println(countLowerCase(ever));
    }

    public static int countLowerCase(Scanner scanner) {
        int lowerCaseCount = 0;
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                
                if (Character.isLowerCase(ch)) {
                    lowerCaseCount++;
                }
            }
        }
        
        return lowerCaseCount;
    }
}
