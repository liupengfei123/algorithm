package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class LongestMountainInArrayTest {
    @Test
    public void test1(){
        LongestMountainInArray	 test = new LongestMountainInArray	();
        Assert.assertEquals(3, test.longestMountain(new int[]{1,2,1}));
    }

    @Test
    public void test2(){
        LongestMountainInArray	 test = new LongestMountainInArray	();
        Assert.assertEquals(0, test.longestMountain(new int[]{2,2,1}));
    }

    @Test
    public void test3(){
        LongestMountainInArray	 test = new LongestMountainInArray	();
        Assert.assertEquals(5, test.longestMountain(new int[]{2,1,4,7,3,2,5}));
    }

    @Test
    public void test4(){
        LongestMountainInArray	 test = new LongestMountainInArray	();
        Assert.assertEquals(6, test.longestMountain(new int[]{1,2,1,4,7,8,3,2,5}));
    }

    @Test
    public void test5(){
        LongestMountainInArray	 test = new LongestMountainInArray	();
        Assert.assertEquals(4, test.longestMountain(new int[]{875,884,239,731,723,685}));
    }


}
