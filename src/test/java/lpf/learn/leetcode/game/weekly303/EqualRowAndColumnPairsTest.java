package lpf.learn.leetcode.game.weekly303;

import org.junit.Assert;
import org.junit.Test;

public class EqualRowAndColumnPairsTest {

    @Test
    public void test1(){
        EqualRowAndColumnPairs test = new EqualRowAndColumnPairs();
        Assert.assertEquals(1, test.equalPairs(new int[][]{{3,2,1},{1,7,6},{2,7,7}}));
    }

    @Test
    public void test2(){
        EqualRowAndColumnPairs test = new EqualRowAndColumnPairs();
        Assert.assertEquals(3, test.equalPairs(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}}));
    }
}
