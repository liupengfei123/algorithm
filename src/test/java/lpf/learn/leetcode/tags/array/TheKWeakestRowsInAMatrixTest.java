package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class TheKWeakestRowsInAMatrixTest {

    @Test
    public void test1(){
        TheKWeakestRowsInAMatrix test = new TheKWeakestRowsInAMatrix();
        Assert.assertArrayEquals(new int[]{2,0,3}, test.kWeakestRows(new int[][]{{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}}, 3));
    }

    @Test
    public void test2(){
        TheKWeakestRowsInAMatrix test = new TheKWeakestRowsInAMatrix();
        Assert.assertArrayEquals(new int[]{0,2,3,1}, test.kWeakestRows(new int[][]{{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}}, 4));
    }

    @Test
    public void test3(){
        TheKWeakestRowsInAMatrix test = new TheKWeakestRowsInAMatrix();
        Assert.assertArrayEquals(new int[]{1,2,3}, test.kWeakestRows(new int[][]{{1,1,1,1,1},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,0},{1,1,1,1,1}}, 3));
    }

}
