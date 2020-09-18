package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class FairCandySwapTest {

    @Test
    public void test1(){
        FairCandySwap test = new FairCandySwap();
        Assert.assertArrayEquals(new int[]{1,2}, test.fairCandySwap(new int[]{1,1}, new int[]{2,2}));
    }

    @Test
    public void test2(){
        FairCandySwap test = new FairCandySwap();
        Assert.assertArrayEquals(new int[]{1,2}, test.fairCandySwap(new int[]{1,2}, new int[]{2,3}));
    }

    @Test
    public void test3(){
        FairCandySwap test = new FairCandySwap();
        Assert.assertArrayEquals(new int[]{2,3}, test.fairCandySwap(new int[]{2}, new int[]{1,3}));
    }

    @Test
    public void test4(){
        FairCandySwap test = new FairCandySwap();
        Assert.assertArrayEquals(new int[]{5,4}, test.fairCandySwap(new int[]{1,2,5}, new int[]{2,4}));
    }
}
