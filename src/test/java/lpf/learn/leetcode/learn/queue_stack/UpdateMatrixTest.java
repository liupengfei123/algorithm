package lpf.learn.leetcode.learn.queue_stack;

import org.junit.Assert;
import org.junit.Test;

public class UpdateMatrixTest {

    @Test
    public void test() {
        UpdateMatrix temp = new UpdateMatrix();

        Assert.assertArrayEquals(new int[][]{{3,2,1},{2,1,0},{1,0,1}}, temp.updateMatrix(new int[][]{{1,1,1},{1,1,0},{1,0,1}}));
        Assert.assertArrayEquals(new int[][]{{0,0,0},{0,1,0},{0,0,0}}, temp.updateMatrix(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
        Assert.assertArrayEquals(new int[][]{{0,0,0},{0,1,0},{1,2,1}}, temp.updateMatrix(new int[][]{{0,0,0},{0,1,0},{1,1,1}}));

    }


}
