package lpf.learn.leetcode.game.weekly241;

import org.junit.Assert;
import org.junit.Test;

public class SumOfAllSubsetXORTotalsTest {
    @Test
    public void test1(){
        SumOfAllSubsetXORTotals test = new SumOfAllSubsetXORTotals();
        Assert.assertEquals(6, test.subsetXORSum(new int[]{1,3}));
    }

    @Test
    public void test2(){
        SumOfAllSubsetXORTotals test = new SumOfAllSubsetXORTotals();
        Assert.assertEquals(480, test.subsetXORSum(new int[]{3,4,5,6,7,8}));
    }
}
