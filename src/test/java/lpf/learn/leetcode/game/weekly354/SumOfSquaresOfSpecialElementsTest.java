package lpf.learn.leetcode.game.weekly354;

import org.junit.Assert;
import org.junit.Test;

public class SumOfSquaresOfSpecialElementsTest {
    @Test
    public void test1(){
        SumOfSquaresOfSpecialElements test = new SumOfSquaresOfSpecialElements();
        Assert.assertEquals(21, test.sumOfSquares(new int[]{1,2,3,4}));
    }

    @Test
    public void test2(){
        SumOfSquaresOfSpecialElements test = new SumOfSquaresOfSpecialElements();
        Assert.assertEquals(63, test.sumOfSquares(new int[]{2,7,1,19,18,3}));
    }
}
