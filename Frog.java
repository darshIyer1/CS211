// Name: Darsh Iyer
// Date: 8 January, 2024
// Course: CS211 11490 - W24 - Fundamentals of CS II
// References used: none

package java20230731;

import java.awt.Color;

import java.util.Random;

public class Frog implements Animal {
    private int moves;
    
    private Random random;

    public Frog() {
        this.moves = 0;
        
        this.random = new Random();
    }

    public Color getColor() {
        return Color.GREEN;
    }

    public String toString() {
        return "F";
    }

    public int getMove() {
        moves++;
        if (moves <= 3) {
            return random.nextInt(4) + 1;
        } else {
            moves = 0;
            return 0;
        }
    }
}
