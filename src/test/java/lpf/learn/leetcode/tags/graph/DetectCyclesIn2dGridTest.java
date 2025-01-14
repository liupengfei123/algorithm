package lpf.learn.leetcode.tags.graph;

import org.junit.Assert;
import org.junit.Test;

public class DetectCyclesIn2dGridTest {
    @Test
    public void test1(){
        DetectCyclesIn2dGrid test = new DetectCyclesIn2dGrid();
        Assert.assertTrue(test.containsCycle(new char[][]{{'a', 'a', 'a', 'a'}, {'a', 'b', 'b', 'a'}, {'a', 'b', 'b', 'a'}, {'a', 'a', 'a', 'a'}}));
    }

    @Test
    public void test2(){
        DetectCyclesIn2dGrid test = new DetectCyclesIn2dGrid();
        Assert.assertTrue(test.containsCycle(new char[][]{{'c', 'c', 'c', 'a'}, {'c', 'd', 'c', 'c'}, {'c', 'c', 'e', 'c'}, {'f', 'c', 'c', 'c'}}));
    }

    @Test
    public void test3(){
        DetectCyclesIn2dGrid test = new DetectCyclesIn2dGrid();
        Assert.assertFalse(test.containsCycle(new char[][]{{'a', 'b', 'b'}, {'b', 'z', 'b'}, {'b', 'b', 'a'}}));
    }

}
