package tests;

import org.junit.Assert;
import org.junit.Test;

import food.Drink;
import food.FoodItem;

public class DrinkTest {
    
    @Test
    public void test() {
        FoodItem drink = new Drink(1.0);
        Assert.assertEquals(1.0, drink.getCost(),0);

    }
}
