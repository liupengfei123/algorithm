package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKPairsWithSmallestSumsTest {
    @Test
    public void test1(){
        FindKPairsWithSmallestSums test = new FindKPairsWithSmallestSums();
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 2));
        list.add(Arrays.asList(1, 4));
        list.add(Arrays.asList(1, 6));
        Assert.assertEquals(list, test.kSmallestPairs(new int[]{1,7,11}, new int[]{2,4,6}, 3));
    }

    @Test
    public void test2(){
        FindKPairsWithSmallestSums test = new FindKPairsWithSmallestSums();
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1,1));
        list.add(Arrays.asList(1,1));
        Assert.assertEquals(list, test.kSmallestPairs(new int[]{1,1,2}, new int[]{1,2,3}, 2));
    }

    @Test
    public void test3(){
        FindKPairsWithSmallestSums test = new FindKPairsWithSmallestSums();
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 2));
        list.add(Arrays.asList(1, 4));
        list.add(Arrays.asList(1, 6));
        Assert.assertEquals(list, test.kSmallestPairs(new int[]{1,7,11}, new int[]{2,4,6}, 3));
    }

    @Test
    public void test4(){
        FindKPairsWithSmallestSums test = new FindKPairsWithSmallestSums();
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 2));
        list.add(Arrays.asList(1, 4));
        list.add(Arrays.asList(1, 6));
        Assert.assertEquals(list, test.kSmallestPairs(new int[]{1,7,11}, new int[]{2,4,6}, 3));
    }

}
