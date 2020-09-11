package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class ShortestUnsortedContinuousSubarrayTest {

    @Test
    public void test1(){
        ShortestUnsortedContinuousSubarray test = new ShortestUnsortedContinuousSubarray();
        Assert.assertEquals(5, test.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }

    @Test
    public void test2(){
        ShortestUnsortedContinuousSubarray test = new ShortestUnsortedContinuousSubarray();
        Assert.assertEquals(2, test.findUnsortedSubarray(new int[]{2, 4, 8, 10, 9, 15}));
    }

    @Test
    public void test3(){
        ShortestUnsortedContinuousSubarray test = new ShortestUnsortedContinuousSubarray();
        Assert.assertEquals(3, test.findUnsortedSubarray(new int[]{2, 4, 10, 8, 9, 15}));
    }

    @Test
    public void test4(){
        ShortestUnsortedContinuousSubarray test = new ShortestUnsortedContinuousSubarray();
        Assert.assertEquals(6, test.findUnsortedSubarray(new int[]{4, 8, 9, 10, 15, 2}));
    }

    @Test
    public void test5(){
        ShortestUnsortedContinuousSubarray test = new ShortestUnsortedContinuousSubarray();
        Assert.assertEquals(0, test.findUnsortedSubarray(new int[]{2, 4, 8, 9, 10, 15}));
    }
}
