package loyalty;
public class Loyalty {
    private double discount;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Loyalty(double discount) {
        this.discount = discount;
    }

    public double applyDiscount(double totalCost) {
        return totalCost * (1 - discount);
    }
}