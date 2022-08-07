package lpf.learn.leetcode.game.biweekly84;

import org.junit.Assert;
import org.junit.Test;

public class CountNumberOfBadPairsTest {
    @Test
    public void test1(){
        CountNumberOfBadPairs test = new CountNumberOfBadPairs();
        Assert.assertEquals(0, test.countBadPairs(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test2(){
        CountNumberOfBadPairs test = new CountNumberOfBadPairs();
        Assert.assertEquals(5, test.countBadPairs(new int[]{4,1,3,3}));
    }

}
