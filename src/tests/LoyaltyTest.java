package tests;

import org.junit.Assert;
import org.junit.Test;

import loyalty.Loyalty;

public class LoyaltyTest {
    @Test
    public void test() {
        Loyalty loyalty = new Loyalty(0.15);
        Assert.assertEquals(17,loyalty.applyDiscount(20.00), 0);
    }
}
