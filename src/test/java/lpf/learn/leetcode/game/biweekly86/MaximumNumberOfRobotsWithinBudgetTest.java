package lpf.learn.leetcode.game.biweekly86;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfRobotsWithinBudgetTest {
    @Test
    public void test1(){
        MaximumNumberOfRobotsWithinBudget test = new MaximumNumberOfRobotsWithinBudget();
        Assert.assertEquals(3, test.maximumRobots(new int[]{3,6,1,3,4}, new int[]{2,1,3,4,5}, 25));
    }


    @Test
    public void test2(){
        MaximumNumberOfRobotsWithinBudget test = new MaximumNumberOfRobotsWithinBudget();
        Assert.assertEquals(0, test.maximumRobots(new int[]{11,12,19}, new int[]{10,8,7}, 19));
    }

    @Test
    public void test3(){
        MaximumNumberOfRobotsWithinBudget test = new MaximumNumberOfRobotsWithinBudget();
        Assert.assertEquals(1, test.maximumRobots(new int[]{11,12,19}, new int[]{10,8,7}, 25));
    }

    @Test
    public void test4(){
        MaximumNumberOfRobotsWithinBudget test = new MaximumNumberOfRobotsWithinBudget();
        Assert.assertEquals(3, test.maximumRobots(new int[]{8,76,74,9,75,71,71,42,15,58,88,38,56,59,10,11},
                new int[]{1,92,41,63,22,37,37,8,68,97,39,59,45,50,29,37}, 412));
    }
}

