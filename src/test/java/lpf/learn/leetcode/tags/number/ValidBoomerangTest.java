package lpf.learn.leetcode.tags.number;

import org.junit.Assert;
import org.junit.Test;

public class ValidBoomerangTest {
    @Test
    public void test1(){
        ValidBoomerang test = new ValidBoomerang();
        Assert.assertTrue(test.isBoomerang(new int[][]{{1, 1}, {2, 3}, {3, 2}}));
    }

    @Test
    public void test2(){
        ValidBoomerang test = new ValidBoomerang();
        Assert.assertFalse(test.isBoomerang(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
    }

    @Test
    public void test3(){
        ValidBoomerang test = new ValidBoomerang();
        Assert.assertFalse(test.isBoomerang(new int[][]{{1, 1}, {2, 2}, {1, 1}}));
    }


    @Test
    public void test4(){
        ValidBoomerang test = new ValidBoomerang();
        Assert.assertTrue(test.isBoomerang(new int[][]{{1, 1}, {2, 2}, {1, 2}}));
    }

    @Test
    public void test5(){
        ValidBoomerang test = new ValidBoomerang();
        Assert.assertFalse(test.isBoomerang(new int[][]{{1, 1}, {2, 1}, {3, 1}}));
    }

    @Test
    public void test6(){
        ValidBoomerang test = new ValidBoomerang();
        Assert.assertTrue(test.isBoomerang(new int[][]{{0, 1}, {0, 2}, {1, 2}}));
    }
}
