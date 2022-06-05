package lpf.learn.leetcode.game.weekly296;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceElementsInAnArrayTest {
    @Test
    public void test1(){
        ReplaceElementsInAnArray test = new ReplaceElementsInAnArray();
        Assert.assertArrayEquals(new int[]{3,2,7,1}, test.arrayChange(new int[]{1,2,4,6}, new int[][]{{1,3},{4,7},{6,1}}));
    }

    @Test
    public void test2(){
        ReplaceElementsInAnArray test = new ReplaceElementsInAnArray();
        Assert.assertArrayEquals(new int[]{2,1}, test.arrayChange(new int[]{1,2}, new int[][]{{1,3},{2,1},{3,2}}));
    }
}
