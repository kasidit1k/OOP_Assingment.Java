package Chap7;

public class CreditCard {

    private double minSalary;

    private CreditCard(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMinSalary() { 
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public static CreditCard createInstance(double minSalary) {
        if (minSalary >= 15000) {
            return new CreditCard(minSalary);
        } else {
            return null;
        }
    }
}//
