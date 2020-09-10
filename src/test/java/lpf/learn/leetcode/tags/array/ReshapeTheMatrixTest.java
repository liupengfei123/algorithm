package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class ReshapeTheMatrixTest {

    @Test
    public void test1(){
        ReshapeTheMatrix test = new ReshapeTheMatrix();
        Assert.assertArrayEquals(new int[][]{{1,2,3,4}}, test.matrixReshape(new int[][]{{1,2},{3,4}}, 1, 4));
    }

    @Test
    public void test2(){
        ReshapeTheMatrix test = new ReshapeTheMatrix();
        Assert.assertArrayEquals(new int[][]{{1,2},{3,4}}, test.matrixReshape(new int[][]{{1,2},{3,4}}, 2, 4));
    }


}
