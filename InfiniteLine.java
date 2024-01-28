// Name: Darsh Iyer
// Date: 16 November 2023
// Course: CS210 13391 - F23 - Fundamentals of CS I FALL 2023
// References used: None

package java20230731.java20230731.java20230731;

import java.awt.*;

public class InfiniteLine {
    private double slope;

    private double intercept;

    public InfiniteLine() {
        this.slope = 0;
        this.intercept = 0;
    }

    public InfiniteLine(Point first, Point second) {
        if (first.x == second.x) {
            throw new IllegalArgumentException();
        }
        
        this.slope = (double) (second.y - first.y) / (second.x - first.x);
        
        this.intercept = first.y - this.slope * first.x;
    }

    public double getSlope() {
        return this.slope;
    }

    public double getIntercept() {
        return this.intercept;
    }

    public void setSlope(double slope) {
        this.slope = slope;
    }

    public void setIntercept(double intercept) {
        this.intercept = intercept;
    }

    public boolean intersect(InfiniteLine line) {
        return this.slope != line.getSlope();
    }

    public boolean intersect(Point point) {
        double y = this.slope * point.x + this.intercept;
        
        return Math.abs(y - point.y) < 0.5;
    }

    @Override
    
    public String toString() {
        return "slope = " + this.slope + " and intercept = " + this.intercept;
    }
}
