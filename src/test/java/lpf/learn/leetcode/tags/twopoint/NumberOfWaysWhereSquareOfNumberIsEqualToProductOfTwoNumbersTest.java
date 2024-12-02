package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbersTest {
    @Test
    public void test1(){
        NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers test = new NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers();
        Assert.assertEquals(1, test.numTriplets(new int[]{7,4}, new int[]{5,2,8,9}));
    }

    @Test
    public void test2(){
        NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers test = new NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers();
        Assert.assertEquals(9, test.numTriplets(new int[]{1,1}, new int[]{1,1,1}));
    }

    @Test
    public void test3(){
        NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers test = new NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers();
        Assert.assertEquals(2, test.numTriplets(new int[]{7,7,8,3}, new int[]{1,2,9,7}));
    }

    @Test
    public void test4(){
        NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers test = new NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers();
        Assert.assertEquals(4, test.numTriplets(new int[]{3,1,2,2}, new int[]{1,3,4,4}));
    }

    @Test
    public void test5(){
        NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers test = new NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers();
        Assert.assertEquals(28, test.numTriplets(new int[]{4,4}, new int[]{2,2,2,4,4,4,4,8,8}));
    }

    @Test
    public void test6(){
        NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers test = new NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers();
        Assert.assertEquals(0, test.numTriplets(new int[]{4,7,9,11,23}, new int[]{3,5,1024,12,18}));
    }

}
