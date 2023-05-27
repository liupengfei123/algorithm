package lpf.learn.leetcode.game.weekly346;

import org.junit.Assert;
import org.junit.Test;

public class ModifyGraphEdgeWeightsTest {
    @Test
    public void test1(){
        ModifyGraphEdgeWeights test = new ModifyGraphEdgeWeights();

        int[][] actual = test.modifiedGraphEdges(5, new int[][]{{4, 1, -1}, {2, 0, -1}, {0, 3, -1}, {4, 3, -1}}, 0, 1, 5);
        int[][] expected = new int[][]{{4,1,1},{2,0,3},{0,3,3},{4,3,1}};

        Assert.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test2(){
        ModifyGraphEdgeWeights test = new ModifyGraphEdgeWeights();

        int[][] actual = test.modifiedGraphEdges(3, new int[][]{{0,1,-1},{0,2,5}}, 0, 2, 6);
        int[][] expected = new int[][]{};

        Assert.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test3(){
        ModifyGraphEdgeWeights test = new ModifyGraphEdgeWeights();

        int[][] actual = test.modifiedGraphEdges(4, new int[][]{{1,0,4},{1,2,3},{2,3,5},{0,3,-1}}, 0, 2, 6);
        int[][] expected = new int[][]{{1,0,4},{1,2,3},{2,3,5},{0,3,1}};

        Assert.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertArrayEquals(expected[i], actual[i]);
        }
    }
}
