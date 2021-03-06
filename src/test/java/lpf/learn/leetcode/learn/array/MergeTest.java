package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class MergeTest {

    @Test
    public void mergeTest(){
        Merge merge = new Merge();

        Assert.assertArrayEquals(new int[][]{{1,6},{8,10},{15,18}}, merge.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}));

        Assert.assertArrayEquals(new int[][]{{1,5}}, merge.merge(new int[][]{{1,4},{4,5}}));
    }
}
