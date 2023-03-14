package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class FindValidMatrixGivenRowAndColumnSumsTest {

    @Test
    public void test1(){
        FindValidMatrixGivenRowAndColumnSums test = new FindValidMatrixGivenRowAndColumnSums();
        Assert.assertArrayEquals(new int[][]{{3,0},{1,7}},
                test.restoreMatrix(new int[]{3,8}, new int[]{4,7}));
    }

    @Test
    public void test2(){
        FindValidMatrixGivenRowAndColumnSums test = new FindValidMatrixGivenRowAndColumnSums();
        Assert.assertArrayEquals(new int[][]{{5,0,0},{3,4,0},{0,2,8}},
                test.restoreMatrix(new int[]{5,7,10}, new int[]{8,6,8}));
    }
}
