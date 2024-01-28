// Name: Darsh Iyer
// Date: 28 November, 2023
// Course: CS210 13391 - F23 - Fundamentals of CS I FALL 2023
// References used: github

package java20230731;

public class HarvardLawyer extends Lawyer {
    public double getSalary() {
        return super.getSalary() * 1.2; 
    }

    public int getVacationDays() {
        return super.getVacationDays() + 3; 
    }

    public String getVacationForm() {
        return super.getVacationForm() + super.getVacationForm() + super.getVacationForm() + super.getVacationForm(); 
    }
}
