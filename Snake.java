// Name: Darsh Iyer
// Date: 8 January, 2024
// Course: CS211 11490 - W24 - Fundamentals of CS II
// References used: none

package java20230731;

import java.awt.Color;

public class Snake implements Animal {
    private int moves;
    
    private int direction;

    public Snake() {
        this.moves = 0;
        
        this.direction = 1;
    }

    public Color getColor() {
        return Color.YELLOW;
    }

    public String toString() {
        return "S";
    }

    public int getMove() {
        moves++;
        if (moves % 2 == 0) {
            direction = (direction % 4) + 1;
            
            moves = 0;
        }
        return direction;
    }
}
