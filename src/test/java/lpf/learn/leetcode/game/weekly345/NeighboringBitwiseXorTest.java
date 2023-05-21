package lpf.learn.leetcode.game.weekly345;

import org.junit.Assert;
import org.junit.Test;

public class NeighboringBitwiseXorTest {
    @Test
    public void test1(){
        NeighboringBitwiseXor test = new NeighboringBitwiseXor();
        Assert.assertTrue(test.doesValidArrayExist(new int[]{1,1,0}));
    }

    @Test
    public void test2(){
        NeighboringBitwiseXor test = new NeighboringBitwiseXor();
        Assert.assertTrue(test.doesValidArrayExist(new int[]{1, 1}));
    }

    @Test
    public void test3(){
        NeighboringBitwiseXor test = new NeighboringBitwiseXor();
        Assert.assertFalse(test.doesValidArrayExist(new int[]{1, 0}));
    }
}
