package lpf.learn.leetcode.tags.graph;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class PacificAtlanticWaterFlowTest {

    @Test
    public void test1(){
        PacificAtlanticWaterFlow test = new PacificAtlanticWaterFlow();

        List<List<Integer>> expecteds = new ArrayList<>();
        expecteds.add(Arrays.asList(0,4));
        expecteds.add(Arrays.asList(1,3));
        expecteds.add(Arrays.asList(1,4));
        expecteds.add(Arrays.asList(2,2));
        expecteds.add(Arrays.asList(3,0));
        expecteds.add(Arrays.asList(3,1));
        expecteds.add(Arrays.asList(4,0));

        Assert.assertEquals(expecteds, test.pacificAtlantic(new int[][]{{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}}));
    }

    @Test
    public void test2(){
        PacificAtlanticWaterFlow test = new PacificAtlanticWaterFlow();

        List<List<Integer>> expecteds = new ArrayList<>();
        expecteds.add(Arrays.asList(0,0));
        expecteds.add(Arrays.asList(0,1));
        expecteds.add(Arrays.asList(1,0));
        expecteds.add(Arrays.asList(1,1));

        Assert.assertEquals(expecteds, test.pacificAtlantic(new int[][]{{2,1},{1,2}}));
    }

    @Test
    public void test3(){
        PacificAtlanticWaterFlow test = new PacificAtlanticWaterFlow();

        List<List<Integer>> expecteds = new ArrayList<>();
        expecteds.add(Arrays.asList(0,4));
        expecteds.add(Arrays.asList(1,2));
        expecteds.add(Arrays.asList(1,3));
        expecteds.add(Arrays.asList(1,4));
        expecteds.add(Arrays.asList(2,1));
        expecteds.add(Arrays.asList(2,2));
        expecteds.add(Arrays.asList(3,1));
        expecteds.add(Arrays.asList(4,0));
        expecteds.add(Arrays.asList(4,1));

        Assert.assertEquals(expecteds, test.pacificAtlantic(new int[][]{{1,3,2,3,5},{3,2,5,4,4},{2,7,5,3,1},{1,7,1,4,5},{5,9,1,2,4}}));
    }
}
