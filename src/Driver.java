import food.Burger;
import food.Drink;
import food.FoodItem;
import food.Fries;
import food.toppings.BaconTopping;
import food.toppings.CheeseTopping;
import loyalty.Loyalty;
import order.Order;

public class Driver {
    public static void main(String[] args) {
        // Create food items with base prices
        FoodItem burger = new Burger(5.0);
        FoodItem fries = new Fries(2.0);
        FoodItem drink = new Drink(1.0);

        // Add toppings to food items
        FoodItem burgerWithCheese = new CheeseTopping(burger, 1.0);
        FoodItem burgerWithBacon = new BaconTopping(burger, 1.0);
        FoodItem baconCheeseBurger = new BaconTopping(burgerWithCheese, .5);

        FoodItem friesWithCheese = new CheeseTopping(fries, 1.0);

        // Create order
        Order order = new Order();
        
        order.addFoodItem(burgerWithBacon);
        System.out.println("Added burger with bacon ($6.00)");
        order.addFoodItem(baconCheeseBurger);
        System.out.println("Added bacon cheeseburger ($6.50)");
        order.addFoodItem(friesWithCheese);
        System.out.println("Added burger with bacon ($3.00)");
        order.addFoodItem(drink);
        System.out.println("Added burger with bacon ($1.00)");

        // Calculate cost of order
        double totalCost = order.getTotalCost();

        System.out.printf("Total cost before loyalty discount: $%.2f%n", totalCost);
        // Apply loyalty discount
        Loyalty loyalty = new Loyalty(0.15); // 15% discount for loyalty status
        double discountedTotalCost = loyalty.applyDiscount(totalCost);

        System.out.printf("Total cost after loyaltydiscount: $%.2f%n", discountedTotalCost);

    }
}