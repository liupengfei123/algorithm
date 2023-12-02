package lpf.learn.leetcode.game.weekly355;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MaximumNumberOfGroupsWithIncreasingLengthTest {
    @Test
    public void test1(){
        MaximumNumberOfGroupsWithIncreasingLength test = new MaximumNumberOfGroupsWithIncreasingLength();
        Assert.assertEquals(3, test.maxIncreasingGroups(Arrays.asList(1,2,5)));
    }

    @Test
    public void test2(){
        MaximumNumberOfGroupsWithIncreasingLength test = new MaximumNumberOfGroupsWithIncreasingLength();
        Assert.assertEquals(2, test.maxIncreasingGroups(Arrays.asList(2,1,2)));
    }

    @Test
    public void test3(){
        MaximumNumberOfGroupsWithIncreasingLength test = new MaximumNumberOfGroupsWithIncreasingLength();
        Assert.assertEquals(1, test.maxIncreasingGroups(Arrays.asList(1,1)));
    }

    @Test
    public void test4(){
        MaximumNumberOfGroupsWithIncreasingLength test = new MaximumNumberOfGroupsWithIncreasingLength();
        Assert.assertEquals(3, test.maxIncreasingGroups(Arrays.asList(2,2,2)));
    }


    @Test
    public void test5(){
        MaximumNumberOfGroupsWithIncreasingLength test = new MaximumNumberOfGroupsWithIncreasingLength();
        Assert.assertEquals(10, test.maxIncreasingGroups(Arrays.asList(1,4,7,4,9,10,5,9,1,10,6)));
    }
}
