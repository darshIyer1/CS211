// Name: Darsh Iyer
// Date: 14 November 2023
// Course: CS210 13391 - F23 - Fundamentals of CS I FALL 2023
// References used: github, chegg

package java20230731;

import java.awt.Graphics;
import java.awt.Point;
import java.lang.Math;

public class Line {
    private Point p1;
    private Point p2;

    public Line() {
        this(new Point(0, 0), new Point(0, 0));
    }

    public Line(Point first, Point second) {
        this.p1 = first;
        this.p2 = second;
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public double getSlope() {
        return (double) (this.p2.y - this.p1.y) / (this.p2.x - this.p1.x);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(this.p2.x - this.p1.x, 2) + Math.pow(this.p2.y - this.p1.y, 2));
    }

    public boolean intersect(Line other) {
        return false;
    }

    public void plot(Graphics gee) {
        gee.drawLine(this.p1.x, this.p1.y, this.p2.x, this.p2.y);
    }

    @Override
    public String toString() {
        return "[(" + this.p1.x + ", " + this.p1.y +"), ("+ this.p2.x+", "+this.p2.y + ")]";
    }
}
