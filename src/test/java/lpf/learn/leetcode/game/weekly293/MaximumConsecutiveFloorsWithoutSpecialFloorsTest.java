package lpf.learn.leetcode.game.weekly293;

import org.junit.Assert;
import org.junit.Test;

public class MaximumConsecutiveFloorsWithoutSpecialFloorsTest {
    @Test
    public void test1(){

        MaximumConsecutiveFloorsWithoutSpecialFloors test = new MaximumConsecutiveFloorsWithoutSpecialFloors();


        Assert.assertEquals(3, test.maxConsecutive(2, 9, new int[]{6,4}));
    }

    @Test
    public void test2(){
        MaximumConsecutiveFloorsWithoutSpecialFloors test = new MaximumConsecutiveFloorsWithoutSpecialFloors();


        Assert.assertEquals(0, test.maxConsecutive(6, 8, new int[]{7,6,8}));
    }

    @Test
    public void test3(){

    }
}
