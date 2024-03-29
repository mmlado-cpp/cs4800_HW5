package tests;

import org.junit.Assert;
import org.junit.Test;

import food.Burger;
import food.FoodItem;
import food.toppings.BaconTopping;

public class BaconToppingTest {
    @Test
    public void test() {
        FoodItem burger = new Burger(5.0);
        FoodItem burgerWithBacon = new BaconTopping(burger, 1.0);
        Assert.assertEquals(6.0,burgerWithBacon.getCost(), 0);
    }
}
