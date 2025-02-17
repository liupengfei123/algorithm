package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

public class MinimumOperationsToReduceAnIntegerTo0Test {
    @Test
    public void test1(){
        MinimumOperationsToReduceAnIntegerTo0 test = new MinimumOperationsToReduceAnIntegerTo0();
        Assert.assertEquals(3, test.minOperations(39));
    }

    @Test
    public void test2(){
        MinimumOperationsToReduceAnIntegerTo0 test = new MinimumOperationsToReduceAnIntegerTo0();
        Assert.assertEquals(3, test.minOperations(54));
    }

    @Test
    public void test3(){
        MinimumOperationsToReduceAnIntegerTo0 test = new MinimumOperationsToReduceAnIntegerTo0();
        Assert.assertEquals(4, test.minOperations(87));
    }
}
