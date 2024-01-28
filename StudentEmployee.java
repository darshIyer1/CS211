// Name: Darsh Iyer
// Date: 30 November 2023
// Course: CS210 13391 - F23 - Fundamentals of CS I FALL 2023
// References used: none

package java20230731;

public class StudentEmployee extends BCEmployee {
    public StudentEmployee() {
        super();
    }

    public StudentEmployee(String name, double hourlyPay) {
        super();
        
        setName(name);
        
        setHourlyPay(hourlyPay);
    }

    public void volunteer() {
        setHourlyPay(0);
    }

    public String toString() {
        return "Student " + super.toString();
    }
}
