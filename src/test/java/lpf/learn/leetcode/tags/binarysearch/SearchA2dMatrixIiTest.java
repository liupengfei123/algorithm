package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class SearchA2dMatrixIiTest {

    @Test
    public void test1(){
        SearchA2dMatrixIi test = new SearchA2dMatrixIi();
        Assert.assertTrue(test.searchMatrix(
                new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}}, 5));
    }

    @Test
    public void test2(){
        SearchA2dMatrixIi test = new SearchA2dMatrixIi();
        Assert.assertFalse(test.searchMatrix(
                new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}}, 20));
    }

    @Test
    public void test3(){
        SearchA2dMatrixIi test = new SearchA2dMatrixIi();
        Assert.assertTrue(test.searchMatrix(
                new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}}, 30));
    }

    @Test
    public void test4(){
        SearchA2dMatrixIi test = new SearchA2dMatrixIi();
        Assert.assertTrue(test.searchMatrix(
                new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}}, 11));
    }

    @Test
    public void test5(){
        SearchA2dMatrixIi test = new SearchA2dMatrixIi();
        Assert.assertTrue(test.searchMatrix(
                new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}}, 19));
    }
}
