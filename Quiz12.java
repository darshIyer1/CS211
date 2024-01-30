// Name: Darsh Iyer
// Date: 15 January, 2024
// Course: CS211 11490 - W24 - Fundamentals of CS II
// References used: None

public class Quiz12 {
    // copyright 2024 Bellevue College
    public static void main(String[] x704) {
        System.out.println(compress("bookkkkkeeper"));
        System.out.println(compress("aa"));
        System.out.println(compress(""));
    }

    public static String compress(String str) {
        if (str.length() < 2) {
            return str; 
        } else if (str.charAt(0) == str.charAt(1)) {
            return compress(str.substring(1));
        } else {
            return str.charAt(0) + compress(str.substring(1));
        }
    }
}
