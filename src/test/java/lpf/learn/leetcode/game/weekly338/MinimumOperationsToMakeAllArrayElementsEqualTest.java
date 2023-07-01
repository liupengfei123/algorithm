package lpf.learn.leetcode.game.weekly338;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class MinimumOperationsToMakeAllArrayElementsEqualTest {
    @Test
    public void test1(){
        MinimumOperationsToMakeAllArrayElementsEqual test = new MinimumOperationsToMakeAllArrayElementsEqual();
        Assert.assertEquals(Arrays.asList(14L,10L), test.minOperations(new int[]{3,1,6,8}, new int[]{1,5}));
    }

    @Test
    public void test2(){
        MinimumOperationsToMakeAllArrayElementsEqual test = new MinimumOperationsToMakeAllArrayElementsEqual();
        Assert.assertEquals(Collections.singletonList(20L), test.minOperations(new int[]{2,9,6,3}, new int[]{10}));
    }
}
