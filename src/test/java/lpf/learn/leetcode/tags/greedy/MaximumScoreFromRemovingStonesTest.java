package lpf.learn.leetcode.tags.greedy;

import org.junit.Assert;
import org.junit.Test;

public class MaximumScoreFromRemovingStonesTest {
    @Test
    public void test1(){
        MaximumScoreFromRemovingStones test = new MaximumScoreFromRemovingStones();
        Assert.assertEquals(3, test.maximumScore(1,2,6));
    }

    @Test
    public void test2(){
        MaximumScoreFromRemovingStones test = new MaximumScoreFromRemovingStones();
        Assert.assertEquals(7, test.maximumScore(4,4,6));
    }

    @Test
    public void test3(){
        MaximumScoreFromRemovingStones test = new MaximumScoreFromRemovingStones();
        Assert.assertEquals(6, test.maximumScore(2,4,6));
    }

    @Test
    public void test4(){
        MaximumScoreFromRemovingStones test = new MaximumScoreFromRemovingStones();
        Assert.assertEquals(8, test.maximumScore(1,8,8));
    }
}
