package lpf.learn.leetcode.tags.sort;

import org.junit.Assert;
import org.junit.Test;

public class InsertIntervalTest {
    @Test
    public void test1(){
        InsertInterval test = new InsertInterval();
        int[][] value = new int[][]{{1,3},{6,9}};
        int[][] result = new int[][]{{1,5},{6,9}};
        Assert.assertArrayEquals(result, test.insert(value, new int[]{2,5}));
    }

    @Test
    public void test2(){
        InsertInterval test = new InsertInterval();
        int[][] value = new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[][] result = new int[][]{{1,2},{3,10},{12,16}};
        Assert.assertArrayEquals(result, test.insert(value, new int[]{4,8}));
    }

    @Test
    public void test3(){
        InsertInterval test = new InsertInterval();
        int[][] value = new int[][]{{1,5}};
        int[][] result = new int[][]{{1,5}};
        Assert.assertArrayEquals(result, test.insert(value, new int[]{2,3}));
    }

    @Test
    public void test9(){
        InsertInterval test = new InsertInterval();
        int[][] value = new int[][]{{1,5}, {6, 9}};
        int[][] result = new int[][]{{1,5}, {6, 9}};
        Assert.assertArrayEquals(result, test.insert(value, new int[]{2,3}));
    }

    @Test
    public void test4(){
        InsertInterval test = new InsertInterval();
        int[][] value = new int[][]{{1,5}};
        int[][] result = new int[][]{{1,5}};
        Assert.assertArrayEquals(result, test.insert(value, new int[]{1,5}));
    }

    @Test
    public void test5(){
        InsertInterval test = new InsertInterval();
        int[][] value = new int[][]{{1,5}};
        int[][] result = new int[][]{{1,7}};
        Assert.assertArrayEquals(result, test.insert(value, new int[]{2,7}));
    }


    @Test
    public void test6(){
        InsertInterval test = new InsertInterval();
        int[][] value = new int[][]{};
        int[][] result = new int[][]{{2,7}};
        Assert.assertArrayEquals(result, test.insert(value, new int[]{2,7}));
    }

    @Test
    public void test7(){
        InsertInterval test = new InsertInterval();
        int[][] value = new int[][]{{1,5}};
        int[][] result = new int[][]{{1,5}, {6,8}};
        Assert.assertArrayEquals(result, test.insert(value, new int[]{6,8}));
    }
    @Test
    public void test8(){
        InsertInterval test = new InsertInterval();
        int[][] value = new int[][]{{6,8}, {9, 10}};
        int[][] result = new int[][]{{1,5}, {6,8}, {9, 10}};
        Assert.assertArrayEquals(result, test.insert(value, new int[]{1,5}));
    }
}
