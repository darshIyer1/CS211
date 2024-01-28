// Name: Darsh Iyer
// Date: 5 January, 2024
// Course: CS211 11490 - W24 - Fundamentals of CS II
// References used: none

package java20230731;

public class Marketer extends Employee {
    @Override

    public double getSalary() {
        return super.getSalary() + 10000;
    }

    @Override

    public String toString() {
        return "Act now, while supplies last!";
    }
}