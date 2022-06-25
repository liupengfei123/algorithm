package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class JEj789Test {
    @Test
    public void test1(){
        JEj789 test = new JEj789();
        Assert.assertEquals(10, test.minCost(new int[][]{{17,2,17},{16,16,5},{14,3,19}}));
    }

    @Test
    public void test2(){
        JEj789 test = new JEj789();
        Assert.assertEquals(2, test.minCost(new int[][]{{7,6,2}}));
    }

}
