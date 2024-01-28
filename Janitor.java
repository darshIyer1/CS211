// Name: Darsh Iyer
// Date: 28 November, 2023
// Course: CS210 13391 - F23 - Fundamentals of CS I FALL 2023
// References used: github

package java20230731;

public class Janitor extends Employee {
    public int getHours() {
        return super.getHours() * 2; 
    }

    public double getSalary() {
        return super.getSalary() - 10000.0; 
    }

    public int getVacationDays() {
        return super.getVacationDays() / 2; 
    }

    public void clean() {
        System.out.println("Workin' for the man.");
    }
}
