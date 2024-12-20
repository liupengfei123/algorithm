package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheSafestPathInAGridTest {
    @Test
    public void test1(){
        FindTheSafestPathInAGrid test = new FindTheSafestPathInAGrid();

        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 0, 0));
        list.add(Arrays.asList(0, 0, 0));
        list.add(Arrays.asList(0, 0, 1));

        Assert.assertEquals(0, test.maximumSafenessFactor(list));
    }

    @Test
    public void test2(){
        FindTheSafestPathInAGrid test = new FindTheSafestPathInAGrid();

        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(0, 0, 1));
        list.add(Arrays.asList(0, 0, 0));
        list.add(Arrays.asList(0, 0, 0));

        Assert.assertEquals(2, test.maximumSafenessFactor(list));
    }

    @Test
    public void test3(){
        FindTheSafestPathInAGrid test = new FindTheSafestPathInAGrid();

        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(0,0,0,1));
        list.add(Arrays.asList(0,0,0,0));
        list.add(Arrays.asList(0,0,0,0));
        list.add(Arrays.asList(1,0,0,0));

        Assert.assertEquals(2, test.maximumSafenessFactor(list));
    }

}
