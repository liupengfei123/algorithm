package lpf.learn.leetcode.game.weekly347;

import org.junit.Assert;
import org.junit.Test;

public class DifferenceOfNumberOfDistinctValuesOnDiagonalsTest {

    @Test
    public void test1(){
        DifferenceOfNumberOfDistinctValuesOnDiagonals test = new DifferenceOfNumberOfDistinctValuesOnDiagonals();
        int[][] actual = test.differenceOfDistinctValues(new int[][]{{1, 2, 3}, {3, 1, 5}, {3, 2, 1}});

        int[][] expected = new int[][]{{1,1,0},{1,0,1},{0,1,1}};
        
        Assert.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test2(){
        DifferenceOfNumberOfDistinctValuesOnDiagonals test = new DifferenceOfNumberOfDistinctValuesOnDiagonals();
        int[][] actual = test.differenceOfDistinctValues(new int[][]{{1}});

        int[][] expected = new int[][]{{0}};

        Assert.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertArrayEquals(expected[i], actual[i]);
        }
    }
}
