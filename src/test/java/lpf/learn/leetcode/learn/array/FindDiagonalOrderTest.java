package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class FindDiagonalOrderTest {

    @Test
    public void pivotIndexTest(){
        FindDiagonalOrder findDiagonalOrder = new FindDiagonalOrder();

        Assert.assertArrayEquals(new int[]{1,2,4,7,5,3,6,8,9}, findDiagonalOrder.findDiagonalOrder(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}));

        Assert.assertArrayEquals(new int[]{1,2,5,9,6,3,4,7,10,13,14,11,8,12,15,16}, findDiagonalOrder.findDiagonalOrder(new int[][]{{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}}));

    }
}
