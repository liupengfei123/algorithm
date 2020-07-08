package lpf.learn.leetcode.learn.queue_stack;

import org.junit.Assert;
import org.junit.Test;

public class FloodFillTest {

    @Test
    public void test() {
        FloodFill temp = new FloodFill();

        Assert.assertArrayEquals(new int[][]{{2,2,2},{2,2,0},{2,0,1}}, temp.floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 1, 1, 2));
        Assert.assertArrayEquals(new int[][]{{1,1,1},{1,1,0},{1,0,2}}, temp.floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 2, 2, 2));

    }


}
