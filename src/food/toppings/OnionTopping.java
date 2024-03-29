package food.toppings;

import food.FoodItem;

public class OnionTopping extends Topping {
    private double cost;

    public OnionTopping(FoodItem foodItem, double cost) {
        super(foodItem);
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + cost;
    }
}