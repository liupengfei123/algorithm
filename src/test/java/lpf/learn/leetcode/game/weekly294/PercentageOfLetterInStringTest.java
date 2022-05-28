package lpf.learn.leetcode.game.weekly294;

import lpf.learn.leetcode.game.FindTriangularSumOfAnArray;
import org.junit.Assert;
import org.junit.Test;

public class PercentageOfLetterInStringTest {
    @Test
    public void test1(){
        FindTriangularSumOfAnArray test = new FindTriangularSumOfAnArray();
        Assert.assertEquals(8, test.triangularSum(new int[]{1,2,3,4,5}));
    }
}
