package order;
import java.util.ArrayList;
import java.util.List;

import food.FoodItem;

public class Order {
    private List<FoodItem> foodItems = new ArrayList<>();

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (FoodItem foodItem : foodItems) {
            totalCost += foodItem.getCost();
        }
        return totalCost;
    }

    /*
    public void printOrderItems() {
        System.out.println("Order Items:");
        for (FoodItem foodItem : foodItems) {
            System.out.println("- " + foodItem.getClass().getSimpleName());
        }
    }
    */
}