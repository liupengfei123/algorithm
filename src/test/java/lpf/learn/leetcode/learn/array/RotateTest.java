package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class RotateTest {

    @Test
    public void rotateTest(){
        RotateMatrixLcci rotate = new RotateMatrixLcci();

        int[][] ints1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotate.rotate(ints1);
        Assert.assertArrayEquals(new int[][]{{7,4,1}, {8,5,2}, {9,6,3}}, ints1);


        int[][] ints2 = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        rotate.rotate(ints2);
        Assert.assertArrayEquals(new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}}, ints2);
    }
}
