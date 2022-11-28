package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class LargestSumOfAveragesTest {

    @Test
    public void test1(){
        LargestSumOfAverages test = new LargestSumOfAverages();
        Assert.assertEquals(20.00000, test.largestSumOfAverages(new int[]{9,1,2,3,9}, 3), 0.00001);
    }

    @Test
    public void test2(){
        LargestSumOfAverages test = new LargestSumOfAverages();
        Assert.assertEquals(20.50000, test.largestSumOfAverages(new int[]{1,2,3,4,5,6,7}, 4), 0.00001);
    }

    @Test
    public void test3(){
        LargestSumOfAverages test = new LargestSumOfAverages();
        Assert.assertEquals(2.50000, test.largestSumOfAverages(new int[]{1,2,3,4}, 1), 0.00001);
    }

    @Test
    public void test4(){
        LargestSumOfAverages test = new LargestSumOfAverages();
        Assert.assertEquals(10, test.largestSumOfAverages(new int[]{1,2,3,4}, 4), 0.00001);
    }

    @Test
    public void test5(){
        LargestSumOfAverages test = new LargestSumOfAverages();
        Assert.assertEquals(18.16667, test.largestSumOfAverages(new int[]{4,1,7,5,6,2,3}, 4), 0.00001);
    }

}
