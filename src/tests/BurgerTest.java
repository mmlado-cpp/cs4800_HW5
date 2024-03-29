package tests;

import org.junit.Assert;
import org.junit.Test;

import food.Burger;
import food.FoodItem;

public class BurgerTest {
    
    @Test
    public void test() {
        FoodItem burger = new Burger(5.0);
        Assert.assertEquals(5.0,burger.getCost(), 0);

    }
}
