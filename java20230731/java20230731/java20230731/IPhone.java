// Name: Darsh Iyer
// Date: 9 January, 2024
// Course: CS211 11490 - W24 - Fundamentals of CS II
// References used: none

package java20230731.java20230731.java20230731;

public class IPhone implements Asset {
    public static final double ANNUAL_DEPRECIATION = 0.2;

    private double originalCost;

    private int currentAge;

    public IPhone(double originalCost, int currentAge) {
        this.originalCost = originalCost;

        this.currentAge = currentAge;
    }

    public IPhone() {
        this(0, 0);
    }

    public double getMarketValue() {
        return originalCost * Math.pow(1 - ANNUAL_DEPRECIATION, currentAge);
    }

    public double getProfit() {
        return getMarketValue() - originalCost;
    }

    public String toString() {
        return "IPhone ( " + currentAge + " years old )";
    }
}