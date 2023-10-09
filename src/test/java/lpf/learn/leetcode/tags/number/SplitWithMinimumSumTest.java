package lpf.learn.leetcode.tags.number;

import org.junit.Assert;
import org.junit.Test;

public class SplitWithMinimumSumTest {
    @Test
    public void test1(){
        SplitWithMinimumSum test = new SplitWithMinimumSum();
        Assert.assertEquals(11, test.splitNum(38));
    }

    @Test
    public void test2(){
        SplitWithMinimumSum test = new SplitWithMinimumSum();
        Assert.assertEquals(59, test.splitNum(4325));
    }

    @Test
    public void test3(){
        SplitWithMinimumSum test = new SplitWithMinimumSum();
        Assert.assertEquals(75, test.splitNum(687));
    }


    @Test
    public void test4(){
        SplitWithMinimumSum test = new SplitWithMinimumSum();
        Assert.assertEquals(11, test.splitNum(38));
    }

    @Test
    public void test5(){
        SplitWithMinimumSum test = new SplitWithMinimumSum();
        Assert.assertEquals(13, test.splitNum(121));
    }
}
