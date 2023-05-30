package lpf.learn.leetcode.game.biweekly105;

import org.junit.Assert;
import org.junit.Test;

public class MaximumStrengthOfAGroupTest {
    @Test
    public void test1(){
        MaximumStrengthOfAGroup test = new MaximumStrengthOfAGroup();
        Assert.assertEquals(1350, test.maxStrength(new int[]{3,-1,-5,2,5,-9}));
    }

    @Test
    public void test2(){
        MaximumStrengthOfAGroup test = new MaximumStrengthOfAGroup();
        Assert.assertEquals(20, test.maxStrength(new int[]{-4,-5,-4}));
    }

    @Test
    public void test3(){
        MaximumStrengthOfAGroup test = new MaximumStrengthOfAGroup();
        Assert.assertEquals(-4, test.maxStrength(new int[]{-4}));
    }

    @Test
    public void test4(){
        MaximumStrengthOfAGroup test = new MaximumStrengthOfAGroup();
        Assert.assertEquals(0, test.maxStrength(new int[]{0, -1}));
    }
}