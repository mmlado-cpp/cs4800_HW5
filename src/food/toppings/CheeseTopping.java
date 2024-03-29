package food.toppings;

import food.FoodItem;

public class CheeseTopping extends Topping {
    private double cost;

    public CheeseTopping(FoodItem foodItem, double cost) {
        super(foodItem);
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + cost;
    }
}