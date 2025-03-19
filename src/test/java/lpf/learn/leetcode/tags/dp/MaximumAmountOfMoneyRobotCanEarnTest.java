package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAmountOfMoneyRobotCanEarnTest {
    @Test
    public void test1(){
        MaximumAmountOfMoneyRobotCanEarn test = new MaximumAmountOfMoneyRobotCanEarn();
        Assert.assertEquals(8, test.maximumAmount(new int[][]{{0,1,-1},{1,-2,3},{2,-3,4}}));
    }

    @Test
    public void test2(){
        MaximumAmountOfMoneyRobotCanEarn test = new MaximumAmountOfMoneyRobotCanEarn();
        Assert.assertEquals(40, test.maximumAmount(new int[][]{{10,10,10},{10,10,10}}));
    }

    @Test
    public void test3(){
        MaximumAmountOfMoneyRobotCanEarn test = new MaximumAmountOfMoneyRobotCanEarn();
        Assert.assertEquals(60, test.maximumAmount(new int[][]{{-7,12,12,13},{-6,19,19,-6},{9,-2,-10,16},{-4,14,-10,-9}}));
    }

    @Test
    public void test4(){
        MaximumAmountOfMoneyRobotCanEarn test = new MaximumAmountOfMoneyRobotCanEarn();
        Assert.assertEquals(29, test.maximumAmount(new int[][]{{-18,-12,-13,-11,17},{11,-7,-9,5,-8},{-3,5,-16,-18,9},{-7,-17,-5,3,-5},{12,-3,4,15,-7}}));
    }
}
