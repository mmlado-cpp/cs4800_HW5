package tests;

import org.junit.Assert;
import org.junit.Test;

import food.FoodItem;
import food.Fries;

public class FriesTest {
    
    @Test
    public void test() {
        FoodItem fries = new Fries(3.0);
        Assert.assertEquals(3, fries.getCost(), 0);

    }
}
