package food.toppings;

import food.FoodItem;

public class BaconTopping extends Topping {
    private double cost;
    

    public BaconTopping(FoodItem foodItem, double cost) {
        super(foodItem);
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + cost;
    }
}