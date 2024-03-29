package tests;

import org.junit.Assert;
import org.junit.Test;

import food.Burger;
import food.FoodItem;
import food.toppings.OnionTopping;

public class OnionToppingTest {
    @Test
    public void test() {
        FoodItem burger = new Burger(5.0);
        FoodItem burgerWithOnion = new OnionTopping(burger, 1.0);
        Assert.assertEquals(6.0, burgerWithOnion.getCost(),0);
    }
}
