package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class MonotonicArrayTest {

    @Test
    public void test1(){
        MonotonicArray test = new MonotonicArray();
        Assert.assertTrue(test.isMonotonic(new int[]{1,2,2,3}));
    }

    @Test
    public void test2(){
        MonotonicArray test = new MonotonicArray();
        Assert.assertTrue(test.isMonotonic(new int[]{6,5,4,4}));
    }

    @Test
    public void test3(){
        MonotonicArray test = new MonotonicArray();
        Assert.assertTrue(test.isMonotonic(new int[]{1,2,4,5}));
    }

    @Test
    public void test4(){
        MonotonicArray test = new MonotonicArray();
        Assert.assertFalse(test.isMonotonic(new int[]{1,3,2}));
    }

    @Test
    public void test5(){
        MonotonicArray test = new MonotonicArray();
        Assert.assertTrue(test.isMonotonic(new int[]{1,1,1}));
    }

    @Test
    public void test6(){
        MonotonicArray test = new MonotonicArray();
        Assert.assertFalse(test.isMonotonic(new int[]{1,1,1,2,2,2,4,4,4,1}));
    }

    @Test
    public void test7(){
        MonotonicArray test = new MonotonicArray();
        Assert.assertTrue(test.isMonotonic(new int[]{1,1,1,2,2,2,4,4,4}));
    }
}
