package lpf.learn.leetcode.game.weekly294;

import org.junit.Assert;
import org.junit.Test;

public class SumOfTotalStrengthOfWizardsTest {
    @Test
    public void test1(){
        SumOfTotalStrengthOfWizards test = new SumOfTotalStrengthOfWizards();
        Assert.assertEquals(44, test.totalStrength(new int[]{1,3,1,2}));
    }

    @Test
    public void test2(){
        SumOfTotalStrengthOfWizards test = new SumOfTotalStrengthOfWizards();
        Assert.assertEquals(213, test.totalStrength(new int[]{5,4,6}));
    }
}
