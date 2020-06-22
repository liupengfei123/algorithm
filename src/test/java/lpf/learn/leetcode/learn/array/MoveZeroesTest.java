package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {

    @Test
    public void moveZeroesTest(){
        MoveZeroes moveZeroes = new MoveZeroes();

        int[] ints1 = {1, 1, 2};
        moveZeroes.moveZeroes(ints1);
        Assert.assertArrayEquals(new int[]{1,1,2}, ints1);


        int[] ints2 = {0, 1, 0, 1, 2};
        moveZeroes.moveZeroes(ints2);
        Assert.assertArrayEquals(new int[]{1, 1, 2, 0, 0}, ints2);


    }
}
