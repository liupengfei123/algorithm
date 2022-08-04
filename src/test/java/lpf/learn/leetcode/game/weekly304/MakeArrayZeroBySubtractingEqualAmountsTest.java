package lpf.learn.leetcode.game.weekly304;

import org.junit.Assert;
import org.junit.Test;

public class MakeArrayZeroBySubtractingEqualAmountsTest {
    @Test
    public void test1(){
        MakeArrayZeroBySubtractingEqualAmounts test = new MakeArrayZeroBySubtractingEqualAmounts();
        Assert.assertEquals(5, test.minimumOperations(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test2(){
        MakeArrayZeroBySubtractingEqualAmounts test = new MakeArrayZeroBySubtractingEqualAmounts();
        Assert.assertEquals(0, test.minimumOperations(new int[]{0}));
    }

    @Test
    public void test3(){
        MakeArrayZeroBySubtractingEqualAmounts test = new MakeArrayZeroBySubtractingEqualAmounts();
        Assert.assertEquals(3, test.minimumOperations(new int[]{1,5,0,3,5}));
    }
}
