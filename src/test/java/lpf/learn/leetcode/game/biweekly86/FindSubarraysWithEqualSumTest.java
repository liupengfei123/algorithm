package lpf.learn.leetcode.game.biweekly86;

import org.junit.Assert;
import org.junit.Test;

public class FindSubarraysWithEqualSumTest {
    @Test
    public void test1(){
        FindSubarraysWithEqualSum test = new FindSubarraysWithEqualSum();
        Assert.assertTrue(test.findSubarrays(new int[]{4, 2, 4}));
    }

    @Test
    public void test2(){
        FindSubarraysWithEqualSum test = new FindSubarraysWithEqualSum();
        Assert.assertFalse(test.findSubarrays(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void test3(){
        FindSubarraysWithEqualSum test = new FindSubarraysWithEqualSum();
        Assert.assertTrue(test.findSubarrays(new int[]{0, 0, 0}));
    }

}
