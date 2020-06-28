package lpf.learn.leetcode.learn.queue_stack;

import org.junit.Assert;
import org.junit.Test;

public class NumSquaresTest {

    @Test
    public void test() {
        NumSquares temp = new NumSquares();

        Assert.assertEquals(3, temp.numSquaresBFS(12));
        Assert.assertEquals(2, temp.numSquaresBFS(13));
        Assert.assertEquals(1, temp.numSquaresBFS(1));

        Assert.assertEquals(3, temp.numSquaresDP(12));
        Assert.assertEquals(2, temp.numSquaresDP(13));
        Assert.assertEquals(1, temp.numSquaresDP(1));


    }
}
