package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestRangeCoveringElementsFromKListsTest {
    @Test
    public void test1() {
        SmallestRangeCoveringElementsFromKLists test = new SmallestRangeCoveringElementsFromKLists();
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(4,10,15,24,26));
        list.add(Arrays.asList(0,9,12,20));
        list.add(Arrays.asList(5,18,22,30));

        Assert.assertArrayEquals(new int[]{20,24},test.smallestRange(list));
    }

    @Test
    public void test2() {
        SmallestRangeCoveringElementsFromKLists test = new SmallestRangeCoveringElementsFromKLists();
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1,2,3));
        list.add(Arrays.asList(1,2,3));
        list.add(Arrays.asList(1,2,3));

        Assert.assertArrayEquals(new int[]{1,1},test.smallestRange(list));
    }

    @Test
    public void test3() {
        SmallestRangeCoveringElementsFromKLists test = new SmallestRangeCoveringElementsFromKLists();
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(4,10,15,24,26));
        list.add(Arrays.asList(0));
        list.add(Arrays.asList(5,18,22,30));

        Assert.assertArrayEquals(new int[]{0,5},test.smallestRange(list));
    }

    @Test
    public void test4() {
        SmallestRangeCoveringElementsFromKLists test = new SmallestRangeCoveringElementsFromKLists();
        int[][] ints = new int[][]{{-1,1},{-2,2},{-3,3},{-4,4},{-5,5},{-6,6},{-7,7},{-8,8},{-9,9},
                {-10,10},{-11,11},{-12,12},{-13,13},{-14,14},{-15,15},{-16,16},{-17,17},{-18,18},{-19,19},
                {-20,20},{-21,21},{-22,22},{-23,23},{-24,24},{-25,25},{-26,26},{-27,27},{-28,28},{-29,29},
                {-30,30},{-31,31},{-32,32},{-33,33},{-34,34},{-35,35},{-36,36},{-37,37},{-38,38},{-39,39},
                {-40,40},{-41,41},{-42,42},{-43,43},{-44,44},{-45,45},{-46,46},{-47,47},{-48,48},{-49,49},
                {-50,50},{-51,51},{-52,52},{-53,53},{-54,54},{-55,55}};
        
        List<List<Integer>> list = new ArrayList<>();
        for (int[] anInt : ints) {
            List<Integer> temp = new ArrayList<>();
            for (int i : anInt) temp.add(i);

            list.add(temp);
        }

        Assert.assertArrayEquals(new int[]{-55,-1},test.smallestRange(list));
    }
}
