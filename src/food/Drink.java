package food;

public class Drink implements FoodItem {
    private double basePrice;

    public Drink(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public double getCost() {
        return basePrice;
    }
}