package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class MaxChunksToMakeSortedTest {

    @Test
    public void test1(){
        MaxChunksToMakeSorted test = new MaxChunksToMakeSorted();
        Assert.assertEquals(1, test.maxChunksToSorted(new int[]{4,3,2,1,0}));
    }

    @Test
    public void test2(){
        MaxChunksToMakeSorted test = new MaxChunksToMakeSorted();
        Assert.assertEquals(3, test.maxChunksToSorted(new int[]{0,3,2,1,4}));
    }

    @Test
    public void test3(){
        MaxChunksToMakeSorted test = new MaxChunksToMakeSorted();
        Assert.assertEquals(4, test.maxChunksToSorted(new int[]{1,0,2,3,4}));
    }

    @Test
    public void test4(){
        MaxChunksToMakeSorted test = new MaxChunksToMakeSorted();
        Assert.assertEquals(3, test.maxChunksToSorted(new int[]{0,1,4,3,2}));
    }
}
