package tests;

import org.junit.Assert;
import org.junit.Test;

import food.Burger;
import food.FoodItem;
import food.Fries;
import order.Order;


public class OrderTest {
    @Test
    public void test() {
        Order order = new Order();

        FoodItem burger = new Burger(5.0);
        FoodItem fries = new Fries(2.0);

        order.addFoodItem(burger);
        order.addFoodItem(fries);

        Assert.assertEquals(7.0, order.getTotalCost(), 0);
    }
}
