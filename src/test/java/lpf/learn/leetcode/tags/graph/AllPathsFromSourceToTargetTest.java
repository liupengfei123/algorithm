package lpf.learn.leetcode.tags.graph;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPathsFromSourceToTargetTest {
    @Test
    public void test1(){
        AllPathsFromSourceToTarget  test = new AllPathsFromSourceToTarget ();
        List<List<Integer>> result = new ArrayList<>();

        result.add(Arrays.asList(0,1,3));
        result.add(Arrays.asList(0,2,3));

        Assert.assertEquals(result, test.allPathsSourceTarget(new int[][]{{1,2},{3},{3},{}}));
    }

    @Test
    public void test2(){
        AllPathsFromSourceToTarget  test = new AllPathsFromSourceToTarget ();
        List<List<Integer>> result = new ArrayList<>();

        result.add(Arrays.asList(0,4));
        result.add(Arrays.asList(0,3,4));
        result.add(Arrays.asList(0,1,3,4));
        result.add(Arrays.asList(0,1,2,3,4));
        result.add(Arrays.asList(0,1,4));

        Assert.assertEquals(result, test.allPathsSourceTarget(new int[][]{{4,3,1},{3,2,4},{3},{4},{}}));
    }

    @Test
    public void test3(){
        AllPathsFromSourceToTarget  test = new AllPathsFromSourceToTarget ();
        List<List<Integer>> result = new ArrayList<>();

        result.add(Arrays.asList(0,1));

        Assert.assertEquals(result, test.allPathsSourceTarget(new int[][]{{1},{}}));
    }

    @Test
    public void test4(){
        AllPathsFromSourceToTarget  test = new AllPathsFromSourceToTarget ();
        List<List<Integer>> result = new ArrayList<>();

        result.add(Arrays.asList(0,1,2,3));
        result.add(Arrays.asList(0,2,3));
        result.add(Arrays.asList(0,3));

        Assert.assertEquals(result, test.allPathsSourceTarget(new int[][]{{1,2,3},{2},{3},{}}));
    }

    @Test
    public void test5(){
        AllPathsFromSourceToTarget  test = new AllPathsFromSourceToTarget ();
        List<List<Integer>> result = new ArrayList<>();

        result.add(Arrays.asList(0,1,2,3));
        result.add(Arrays.asList(0,3));

        Assert.assertEquals(result, test.allPathsSourceTarget(new int[][]{{1,3},{2},{3},{}}));
    }

}
