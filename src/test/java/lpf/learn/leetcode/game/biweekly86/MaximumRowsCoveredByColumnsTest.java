package lpf.learn.leetcode.game.biweekly86;

import org.junit.Assert;
import org.junit.Test;

public class MaximumRowsCoveredByColumnsTest {
    @Test
    public void test1(){
        MaximumRowsCoveredByColumns test = new MaximumRowsCoveredByColumns();
        Assert.assertEquals(3, test.maximumRows(new int[][]{{0,0,0},{1,0,1},{0,1,1},{0,0,1}}, 2));
    }

    @Test
    public void test2(){
        MaximumRowsCoveredByColumns test = new MaximumRowsCoveredByColumns();
        Assert.assertEquals(2, test.maximumRows(new int[][]{{1},{0}}, 1));
    }
}
