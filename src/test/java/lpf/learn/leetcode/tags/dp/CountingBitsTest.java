package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class CountingBitsTest {
    @Test
    public void test1(){
        CountingBits test = new CountingBits();
        int[] array = new int[]{0,1,1};
        Assert.assertArrayEquals(array, test.countBits(2));
    }

    @Test
    public void test2(){
        CountingBits test = new CountingBits();
        int[] array = new int[]{0,1,1,2,1,2};
        Assert.assertArrayEquals(array, test.countBits(5));
    }

    @Test
    public void test3(){
        CountingBits test = new CountingBits();
        int[] array = new int[]{0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,2,3,3};
        Assert.assertArrayEquals(array, test.countBits(50));
    }

    @Test
    public void test4(){
        CountingBits test = new CountingBits();
        int[] array = new int[]{0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,2,3,3,4,3};
        Assert.assertArrayEquals(array, test.countBits(100));
    }

    @Test
    public void test5(){
        CountingBits test = new CountingBits();
        int[] array = new int[]{0,1};
        Assert.assertArrayEquals(array, test.countBits(1));
    }
    @Test
    public void test6(){
        CountingBits test = new CountingBits();
        int[] array = new int[]{0};
        Assert.assertArrayEquals(array, test.countBits(0));
    }
}
