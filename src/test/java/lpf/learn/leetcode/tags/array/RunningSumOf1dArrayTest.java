package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class RunningSumOf1dArrayTest {

    @Test
    public void test1(){
        RunningSumOf1dArray test = new RunningSumOf1dArray();
        Assert.assertArrayEquals(new int[]{1,3,6,10}, test.runningSum(new int[]{1,2,3,4}));
    }

    @Test
    public void test2(){
        RunningSumOf1dArray test = new RunningSumOf1dArray();
        Assert.assertArrayEquals(new int[]{1,2,3,4,5}, test.runningSum(new int[]{1,1,1,1,1}));
    }

    @Test
    public void test3(){
        RunningSumOf1dArray test = new RunningSumOf1dArray();
        Assert.assertArrayEquals(new int[]{3,4,6,16,17}, test.runningSum(new int[]{3,1,2,10,1}));
    }

}
