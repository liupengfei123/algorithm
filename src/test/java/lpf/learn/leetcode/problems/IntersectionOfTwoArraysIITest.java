package lpf.learn.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;


public class IntersectionOfTwoArraysIITest {
    @Test
    public void test() {

        IntersectionOfTwoArraysII temp = new IntersectionOfTwoArraysII();


        Assert.assertArrayEquals(new int[]{-2147483648, 1}, temp.intersect(new int[]{-2147483648,1,2,3}, new int[]{1,-2147483648,-2147483648}));


    }


}
