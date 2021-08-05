package lpf.learn.leetcode.tags.graph;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FindEventualSafeStatesTest {
    @Test
    public void test1(){
        FindEventualSafeStates test = new FindEventualSafeStates();

        List<Integer> list = Arrays.asList(2, 4, 5, 6);
        Assert.assertEquals(list, test.eventualSafeNodes(new int[][]{{1,2},{2,3},{5},{0},{5},{},{}}));
    }

    @Test
    public void test2(){
        FindEventualSafeStates test = new FindEventualSafeStates();

        List<Integer> list = Arrays.asList(4);
        Assert.assertEquals(list, test.eventualSafeNodes(new int[][]{{1,2,3,4},{1,2},{3,4},{0,4},{}}));
    }

    @Test
    public void test3(){
        FindEventualSafeStates test = new FindEventualSafeStates();

        List<Integer> list = Arrays.asList(0,1,2,3,4);
        Assert.assertEquals(list, test.eventualSafeNodes(new int[][]{{},{0,2,3,4},{3},{4},{}}));
    }

}
