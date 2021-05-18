package lpf.learn.leetcode.game;

import org.junit.Assert;
import org.junit.Test;

public class MaximumDistanceBetweenAPairOfValuesTest {
    @Test
    public void test1(){
        MaximumDistanceBetweenAPairOfValues test = new MaximumDistanceBetweenAPairOfValues();
        Assert.assertEquals(2, test.maxDistance(new int[]{55,30,5,4,2}, new int[]{100,20,10,10,5}));
    }

    @Test
    public void test2(){
        MaximumDistanceBetweenAPairOfValues test = new MaximumDistanceBetweenAPairOfValues();
        Assert.assertEquals(1, test.maxDistance(new int[]{2,2,2}, new int[]{10,10,1}));
    }

    @Test
    public void test3(){
        MaximumDistanceBetweenAPairOfValues test = new MaximumDistanceBetweenAPairOfValues();
        Assert.assertEquals(2, test.maxDistance(new int[]{30,29,19,5}, new int[]{25,25,25,25,25}));
    }

    @Test
    public void test4(){
        MaximumDistanceBetweenAPairOfValues test = new MaximumDistanceBetweenAPairOfValues();
        Assert.assertEquals(0, test.maxDistance(new int[]{5,4}, new int[]{3,2}));
    }

    @Test
    public void test5(){
        MaximumDistanceBetweenAPairOfValues test = new MaximumDistanceBetweenAPairOfValues();
        Assert.assertEquals(1, test.maxDistance(new int[]{2}, new int[]{2,2,1}));
    }


}
