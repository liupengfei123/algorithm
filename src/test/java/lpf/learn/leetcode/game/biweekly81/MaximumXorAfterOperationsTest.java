package lpf.learn.leetcode.game.biweekly81;

import org.junit.Assert;
import org.junit.Test;

public class MaximumXorAfterOperationsTest {

    @Test
    public void test1(){
        MaximumXorAfterOperations test = new MaximumXorAfterOperations();
        Assert.assertEquals(7, test.maximumXOR(new int[]{3,2,4,6}));
    }


    @Test
    public void test2(){
        MaximumXorAfterOperations test = new MaximumXorAfterOperations();
        Assert.assertEquals(11, test.maximumXOR(new int[]{1,2,3,9,2}));
    }

}
