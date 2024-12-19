package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class MaximumNumberThatSumOfThePricesIsLessThanOrEqualToKTest {

    @Test
    public void test1(){
        MaximumNumberThatSumOfThePricesIsLessThanOrEqualToK test = new MaximumNumberThatSumOfThePricesIsLessThanOrEqualToK();
        Assert.assertEquals(6, test.findMaximumNumber(9, 1));
    }

    @Test
    public void test2(){
        MaximumNumberThatSumOfThePricesIsLessThanOrEqualToK test = new MaximumNumberThatSumOfThePricesIsLessThanOrEqualToK();
        Assert.assertEquals(9, test.findMaximumNumber(7, 2));
    }

    @Test
    public void test3(){
        MaximumNumberThatSumOfThePricesIsLessThanOrEqualToK test = new MaximumNumberThatSumOfThePricesIsLessThanOrEqualToK();
        Assert.assertEquals(6, test.findMaximumNumber(10, 1));
    }

    @Test
    public void test4(){
        MaximumNumberThatSumOfThePricesIsLessThanOrEqualToK test = new MaximumNumberThatSumOfThePricesIsLessThanOrEqualToK();
        Assert.assertEquals(16, test.findMaximumNumber(33, 1));
    }

    @Test
    public void test5(){
        MaximumNumberThatSumOfThePricesIsLessThanOrEqualToK test = new MaximumNumberThatSumOfThePricesIsLessThanOrEqualToK();
        Assert.assertEquals(122, test.findMaximumNumber(419, 1));
    }
}
