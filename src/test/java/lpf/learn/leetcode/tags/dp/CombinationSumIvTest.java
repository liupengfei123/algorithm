package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class CombinationSumIvTest {
    @Test
    public void test1(){
        CombinationSumIv test = new CombinationSumIv();
        Assert.assertEquals(7, test.combinationSum4(new int[]{1, 2, 3}, 4));
    }

    @Test
    public void test2(){
        CombinationSumIv test = new CombinationSumIv();
        Assert.assertEquals(13, test.combinationSum4(new int[]{1, 2, 3}, 5));
    }

    @Test
    public void test3(){
        CombinationSumIv test = new CombinationSumIv();
        Assert.assertEquals(8, test.combinationSum4(new int[]{1, 2}, 5));
    }

}
