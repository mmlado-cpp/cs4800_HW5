package tests;

import org.junit.Assert;
import org.junit.Test;

import food.FoodItem;
import food.Fries;

import food.toppings.CheeseTopping;

public class CheeseToppingTest {
    @Test
    public void test() {
        FoodItem fries = new Fries(2.0);
        FoodItem friesWithCheese = new CheeseTopping(fries, 1.0);

        Assert.assertEquals(3.0, friesWithCheese.getCost(),0);
    }
}
