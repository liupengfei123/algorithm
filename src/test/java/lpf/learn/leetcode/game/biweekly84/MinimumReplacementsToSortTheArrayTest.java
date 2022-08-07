package lpf.learn.leetcode.game.biweekly84;

import org.junit.Assert;
import org.junit.Test;

public class MinimumReplacementsToSortTheArrayTest {
    @Test
    public void test1(){
        MinimumReplacementsToSortTheArray test = new MinimumReplacementsToSortTheArray();
        Assert.assertEquals(0, test.minimumReplacement(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test2(){
        MinimumReplacementsToSortTheArray test = new MinimumReplacementsToSortTheArray();
        Assert.assertEquals(2, test.minimumReplacement(new int[]{3,9,3}));
    }

    @Test
    public void test3(){
        MinimumReplacementsToSortTheArray test = new MinimumReplacementsToSortTheArray();
        Assert.assertEquals(73, test.minimumReplacement(new int[]{19,7,2,24,11,16,1,11,23}));
    }

    @Test
    public void test4(){
        MinimumReplacementsToSortTheArray test = new MinimumReplacementsToSortTheArray();
        Assert.assertEquals(6, test.minimumReplacement(new int[]{12,9,7,6,17,19,21}));
    }

    @Test
    public void test5(){
        MinimumReplacementsToSortTheArray test = new MinimumReplacementsToSortTheArray();
        Assert.assertEquals(4, test.minimumReplacement(new int[]{3,10,3}));
    }
}
