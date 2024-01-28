// Name: Darsh Iyer
// Date: 31 October, 2023
// Course: CS210 13391 - F23 - Fundamentals of CS I FALL 2023
// References used: github, chegg

package java20230731;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWordStats {

    public static void main(String[] args) {
        String fileName = fileName();
        Scanner fileScan = openFile(fileName);
        if (fileScan == null) {
            return;
        }
        String stats = getStats(fileScan);
        System.out.println(stats);
        fileScan.close();
    }

    private static String fileName() {
        System.out.print("What is the name of the file? ");
        
        Scanner userInputScanner = new Scanner(System.in);
        
        String nameOfFile = userInputScanner.nextLine();
        
        userInputScanner.close();
        
        return nameOfFile;
    }

    private static Scanner openFile(String fileName) {
        // learnt this handy tool from chegg, try catch, had used it before in web development but first time using in java
        try {
            return new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("🥲 file doesnt exist");
        
            return null;
        }
    }

    private static String getStats(Scanner scanner) {
        int lineCount = 0;
        
        int wordCount = 0;
        
        int charCount = 0;
        
        int charCountWithSpace = 0;
        
        int longestWordLength = 0;
        
        int longestWordCount = 0;
        
        String exampleLongestWord = "";
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
        
            lineCount++;
            
            String[] wordsInLine = line.split(" ");
            wordCount += wordsInLine.length;
            
            for (String word : wordsInLine) {
                int wordLength = word.length();
        
                charCount += wordLength;
        
                charCountWithSpace += wordLength + 1;

                if (wordLength > longestWordLength) {
                    longestWordLength = wordLength;
        
                    longestWordCount = 1;
        
                    exampleLongestWord = word;
                } else if (wordLength == longestWordLength) {
                    longestWordCount++;
                }
            }
        }
        
        double averageCharInWords = (double) charCount / wordCount;
        
        return "Total lines in the file: " + lineCount + "\nTotal words in the file: " + wordCount + "\nTotal number of characters in those words: " + charCount + "\nTotal number of characters including white space: " + charCountWithSpace + "\nAverage number of characters in those words: " + averageCharInWords + "\nLongest word length: " + longestWordLength + "\nNumber of words with same length as longest word length: " + longestWordCount + "\nExample of longest word: " + exampleLongestWord;
    }
}
