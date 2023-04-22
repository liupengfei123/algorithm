package lpf.learn.leetcode.game.weekly341;

import org.junit.Assert;
import org.junit.Test;

public class FindTheMaximumDivisibilityScoreTest {

    @Test
    public void test1(){
        FindTheMaximumDivisibilityScore test = new FindTheMaximumDivisibilityScore();
        Assert.assertEquals(3, test.maxDivScore(new int[]{4,7,9,3,9}, new int[]{5,2,3}));
    }

    @Test
    public void test2(){
        FindTheMaximumDivisibilityScore test = new FindTheMaximumDivisibilityScore();
        Assert.assertEquals(5, test.maxDivScore(new int[]{20,14,21,10}, new int[]{5,7,5}));
    }

    @Test
    public void test3(){
        FindTheMaximumDivisibilityScore test = new FindTheMaximumDivisibilityScore();
        Assert.assertEquals(10, test.maxDivScore(new int[]{12}, new int[]{10,16}));
    }
}
