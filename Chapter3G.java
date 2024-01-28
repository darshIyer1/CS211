// Name: Darsh Iyer
// Date: 26 October, 2023 (Don't mind the date of the package, it's a package I've been using to write java code since I started a online course in end of July)
// Course: CS210 13391 - F23 - Fundamentals of CS I FALL 2023
// References used: chegg, faced quite some difficulty on this so I needed some guidance

package java20230731;

import java.awt.Color;
import java.awt.Graphics;

public class Chapter3G {
    private static int totalLines = 21; 

    public static void main(String[] args) {
        DrawingPanel food = new DrawingPanel(230, 630);
        Graphics good = food.getGraphics();
        good.drawRect(10,10,200,600); 

        good.setColor(Color.BLACK);

        good.drawLine(0, 310, 220, 310);
        good.drawLine(110, 10, 110, 300);
        good.drawLine(110, 320, 110, 610);

        int difference = 110 / (totalLines / 2);

        for (int i = 1; i <= totalLines / 2; i++) {
            good.drawLine(110, 10, 110 - (difference * i), 160);
            good.drawLine(110, 10, 110 + (difference * i), 160);
            good.drawLine(110 - (difference * i), 160, 110, 300);
            good.drawLine(110 + (difference * i), 160, 110, 300);
            good.drawLine(110 - (difference * i), 320, 110 + (difference * i), 600);
            good.drawLine(110 + (difference * i), 320, 110 - (difference * i), 600);
        }
    }
}
