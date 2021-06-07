package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfDiceRollsWithTargetSumTest {
    @Test
    public void test1(){
        NumberOfDiceRollsWithTargetSum test = new NumberOfDiceRollsWithTargetSum();
        Assert.assertEquals(1, test.numRollsToTarget(1, 6, 3));
    }

    @Test
    public void test2(){
        NumberOfDiceRollsWithTargetSum test = new NumberOfDiceRollsWithTargetSum();
        Assert.assertEquals(6, test.numRollsToTarget(2, 6, 7));
    }

    @Test
    public void test3(){
        NumberOfDiceRollsWithTargetSum test = new NumberOfDiceRollsWithTargetSum();
        Assert.assertEquals(1, test.numRollsToTarget(2, 5, 10));
    }

    @Test
    public void test4(){
        NumberOfDiceRollsWithTargetSum test = new NumberOfDiceRollsWithTargetSum();
        Assert.assertEquals(0, test.numRollsToTarget(1, 2, 3));
    }

    @Test
    public void test5(){
        NumberOfDiceRollsWithTargetSum test = new NumberOfDiceRollsWithTargetSum();
        Assert.assertEquals(222616187, test.numRollsToTarget(30, 30, 500));
    }

}
