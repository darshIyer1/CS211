// Name: Darsh Iyer
// Date: 4 January, 2024
// Course: CS211 11490 - W24 - Fundamentals of CS II
// References used: github

package java20230731.java20230731.java20230731;

public class DiscountBill extends GroceryBill {
    private boolean preferred;
    private int discountCount;
    private double discountAmount;
// 1st constructor
    public DiscountBill (Employee clerk, boolean preferred) {
        super(clerk);
        this.discountCount = 0;
        this.discountAmount = 0;
        this.preferred = preferred;
    }
// 2nd constructor
    public DiscountBill (Employee clerk) {
        this(clerk, false); 
    }

    public double getTotal () {
        return super.getTotal () - discountAmount;
    }

    public void add (Item i) {
        super.add(i);

        if (preferred && i.getDiscount () > 0) {
            discountCount++;
            discountAmount += i.getDiscount ();
        }
    }

    public int getDiscountCount () {
        return discountCount;
    }

    public double getDiscountAmount () {
        return discountAmount;
    }

    public double getDiscountPercent () {
        return (discountAmount * 100) / super.getTotal ();
    }
}
