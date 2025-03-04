package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class MinCostClimbingStairsTest {

    @Test
    public void test1(){
        MinCostClimbingStairs test = new MinCostClimbingStairs();
        Assert.assertEquals(8, test.minCostClimbingStairs(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void test2(){
        MinCostClimbingStairs test = new MinCostClimbingStairs();
        Assert.assertEquals(107, test.minCostClimbingStairs(new int[]{1,100,110,3,6,4}));
    }

    @Test
    public void test3(){
        MinCostClimbingStairs test = new MinCostClimbingStairs();
        Assert.assertEquals(15, test.minCostClimbingStairs(new int[]{10, 15, 20}));
    }

    @Test
    public void test4(){
        MinCostClimbingStairs test = new MinCostClimbingStairs();
        Assert.assertEquals(6, test.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
