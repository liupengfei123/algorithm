package lpf.learn.leetcode.game.weekly240;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarrayMinProductTest {
    @Test
    public void test1(){
        MaximumSubarrayMinProduct test = new MaximumSubarrayMinProduct();
        Assert.assertEquals(14, test.maxSumMinProduct(new int[]{1,2,3,2}));
    }

    @Test
    public void test2(){
        MaximumSubarrayMinProduct test = new MaximumSubarrayMinProduct();
        Assert.assertEquals(18, test.maxSumMinProduct(new int[]{2,3,3,1,2}));
    }

    @Test
    public void test3(){
        MaximumSubarrayMinProduct test = new MaximumSubarrayMinProduct();
        Assert.assertEquals(60, test.maxSumMinProduct(new int[]{3,1,5,6,4,2}));
    }
}
