package lpf.learn.leetcode.game.weekly297;

import org.junit.Assert;
import org.junit.Test;

public class CalculateAmountPaidInTaxesTest {

    @Test
    public void test1(){
        CalculateAmountPaidInTaxes test = new CalculateAmountPaidInTaxes();
        Assert.assertEquals(2.65000, test.calculateTax(new int[][]{{3,50},{7,10},{12,25}}, 10), 0.00001);
    }

    @Test
    public void test2(){
        CalculateAmountPaidInTaxes test = new CalculateAmountPaidInTaxes();
        Assert.assertEquals(2.65000, test.calculateTax(new int[][]{{3,50},{7,10},{12,25}}, 10), 0.00001);
    }

}
