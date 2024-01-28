// Name: Darsh Iyer
// Date: 26 October, 2023 (Don't mind the date of the package, it's a package I've been using to write java code since I started a online course in end of July)
// Course: CS210 13391 - F23 - Fundamentals of CS I FALL 2023
// References used: none

package java20230731;

import java.awt.Color;
import java.awt.Graphics;

public class SquareFaceX {
    private static int totalSquares = 30; 
    private static int squareSize = 50;
    private static int eyeSize = 10;

    public static void main(String[] args) {
        DrawingPanel food = new DrawingPanel(800, 800);
        Graphics good = food.getGraphics();

        for (int i = 0; i < totalSquares / 2; i++) {
            int x = i * squareSize;
            int y = i * squareSize;

            // Draw face in square for "\"
            drawFace(good, x, y);

            // Draw face in square for "/", shifted 50 pixels to the left
            drawFace(good, 800 - x - squareSize - 50, y);
        }
    }

    public static void drawFace(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, squareSize, squareSize);   // face outline

        g.setColor(Color.BLUE);
        g.fillOval(x + eyeSize, y + eyeSize, eyeSize, eyeSize);     // eyes
        g.fillOval(x + squareSize - 2 * eyeSize, y + eyeSize, eyeSize, eyeSize);

        g.setColor(Color.RED);          // mouth
        g.drawLine(x + eyeSize, y + squareSize / 2, x + squareSize - eyeSize, y + squareSize / 2);
    }
}
