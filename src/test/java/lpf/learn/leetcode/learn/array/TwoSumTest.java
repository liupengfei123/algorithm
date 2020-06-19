package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSumTest(){
        TwoSum twoSum = new TwoSum();

        Assert.assertArrayEquals(new int[]{1, 3}, twoSum.twoSum(new int[]{1,4,3,2}, 4));

        Assert.assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));


    }
}
