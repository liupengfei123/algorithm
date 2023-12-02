package lpf.learn.leetcode.game.weekly355;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class SplitStringsBySeparatorTest {
    @Test
    public void test1(){
        SplitStringsBySeparator test = new SplitStringsBySeparator();
        Assert.assertEquals(Arrays.asList("one","two","three","four","five","six"),
                test.splitWordsBySeparator(Arrays.asList("one.two.three","four.five","six"), '.'));
    }

    @Test
    public void test2(){
        SplitStringsBySeparator test = new SplitStringsBySeparator();
        Assert.assertEquals(Arrays.asList("easy","problem"),
                test.splitWordsBySeparator(Arrays.asList("$easy$","$problem$"), '$'));
    }

    @Test
    public void test3(){
        SplitStringsBySeparator test = new SplitStringsBySeparator();
        Assert.assertEquals(Collections.emptyList(),
                test.splitWordsBySeparator(Collections.singletonList("|||"), '|'));
    }
}
