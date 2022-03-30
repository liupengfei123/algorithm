package lpf.learn.leetcode.tags.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifferenceTest {
    @Test
    public void test1(){
        MinimumAbsoluteDifference test = new MinimumAbsoluteDifference();

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1,2));
        expected.add(Arrays.asList(2,3));
        expected.add(Arrays.asList(3,4));

        Assert.assertEquals(expected, test.minimumAbsDifference(new int[]{4,2,1,3}));
    }

    @Test
    public void test2(){
        MinimumAbsoluteDifference test = new MinimumAbsoluteDifference();

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1,3));

        Assert.assertEquals(expected, test.minimumAbsDifference(new int[]{1,3,6,10,15}));
    }

    @Test
    public void test3(){
        MinimumAbsoluteDifference test = new MinimumAbsoluteDifference();

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-14,-10));
        expected.add(Arrays.asList(19,23));
        expected.add(Arrays.asList(23,27));

        Assert.assertEquals(expected, test.minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27}));
    }

    @Test
    public void test4(){
        MinimumAbsoluteDifference test = new MinimumAbsoluteDifference();

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1,2));
        expected.add(Arrays.asList(2,3));
        expected.add(Arrays.asList(3,4));
        expected.add(Arrays.asList(4,5));
        expected.add(Arrays.asList(5,6));
        expected.add(Arrays.asList(6,7));
        expected.add(Arrays.asList(12,13));
        expected.add(Arrays.asList(13,14));
        expected.add(Arrays.asList(16,17));

        Assert.assertEquals(expected, test.minimumAbsDifference(new int[]{4,2,1,3,12,14,41,16,-1,13,5,17,46,6,7}));
    }

}
