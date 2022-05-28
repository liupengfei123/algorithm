package lpf.learn.leetcode.game.weekly294;

import org.junit.Assert;
import org.junit.Test;

public class MaximumBagsWithFullCapacityOfRocksTest {
    @Test
    public void test1(){
        MaximumBagsWithFullCapacityOfRocks test = new MaximumBagsWithFullCapacityOfRocks();
        Assert.assertEquals(3, test.maximumBags(new int[]{2,3,4,5}, new int[]{1,2,4,4}, 2));
    }

    @Test
    public void test2(){
        MaximumBagsWithFullCapacityOfRocks test = new MaximumBagsWithFullCapacityOfRocks();
        Assert.assertEquals(3, test.maximumBags(new int[]{10,2,2}, new int[]{2,2,0}, 100));
    }
}
