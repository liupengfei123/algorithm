package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPairsOfPointsWithDistanceKTest {
    @Test
    public void test1(){
        CountPairsOfPointsWithDistanceK test = new CountPairsOfPointsWithDistanceK();
        List<List<Integer>> coordinates = new ArrayList<>();
        coordinates.add(Arrays.asList(1,2));
        coordinates.add(Arrays.asList(4,2));
        coordinates.add(Arrays.asList(1,3));
        coordinates.add(Arrays.asList(5,2));

        Assert.assertEquals(2, test.countPairs(coordinates, 5));
    }

    @Test
    public void test2(){
        CountPairsOfPointsWithDistanceK test = new CountPairsOfPointsWithDistanceK();
        List<List<Integer>> coordinates = new ArrayList<>();
        coordinates.add(Arrays.asList(1,3));
        coordinates.add(Arrays.asList(1,3));
        coordinates.add(Arrays.asList(1,3));
        coordinates.add(Arrays.asList(1,3));
        coordinates.add(Arrays.asList(1,3));

        Assert.assertEquals(10, test.countPairs(coordinates, 0));
    }

}
