package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class CountTheNumberOfFairPairsTest {
    @Test
    public void test1(){
        CountTheNumberOfFairPairs test = new CountTheNumberOfFairPairs();
        Assert.assertEquals(6, test.countFairPairs(new int[]{0,1,7,4,4,5}, 3, 6));
    }

    @Test
    public void test2(){
        CountTheNumberOfFairPairs test = new CountTheNumberOfFairPairs();
        Assert.assertEquals(1, test.countFairPairs(new int[]{1,7,9,2,5}, 11, 11));
    }

    @Test
    public void test3(){
        CountTheNumberOfFairPairs test = new CountTheNumberOfFairPairs();
        Assert.assertEquals(15, test.countFairPairs(new int[]{0,0,0,0,0,0}, 0, 0));
    }

    @Test
    public void test4(){
        CountTheNumberOfFairPairs test = new CountTheNumberOfFairPairs();
        Assert.assertEquals(0, test.countFairPairs(new int[]{-1,0}, 1, 1));
    }
}
