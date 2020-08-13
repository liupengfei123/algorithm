package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class SetZeroesTest {

    @Test
    public void setZeroesTest(){
        ZeroMatrixLcci setZeroes = new ZeroMatrixLcci();

        int[][] ints1 = {{1,1,1}, {1,0,1}, {1,1,1}};
        setZeroes.setZeroes(ints1);
        Assert.assertArrayEquals(new int[][]{{1,0,1}, {0,0,0}, {1,0,1}}, ints1);


        int[][] ints2 = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        setZeroes.setZeroes(ints2);
        Assert.assertArrayEquals(new int[][]{{0,0,0,0}, {0,4,5,0}, {0,3,1,0}}, ints2);
    }
}
