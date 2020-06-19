package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class ArrayPairSumTest {

    @Test
    public void arrayPairSumTest(){
        ArrayPairSum arrayPairSum = new ArrayPairSum();

        Assert.assertEquals(4, arrayPairSum.arrayPairSum(new int[]{1,4,3,2}));

        Assert.assertEquals(0, arrayPairSum.arrayPairSum(new int[]{}));



    }
}
