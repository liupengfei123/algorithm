package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class MinimumOperationsToReduceXToZeroTest {

    @Test
    public void test1(){
        MinimumOperationsToReduceXToZero test = new MinimumOperationsToReduceXToZero();
        Assert.assertEquals(2, test.minOperations(new int[]{1,1,4,2,3}, 5));
    }

    @Test
    public void test2(){
        MinimumOperationsToReduceXToZero test = new MinimumOperationsToReduceXToZero();
        Assert.assertEquals(-1, test.minOperations(new int[]{5,6,7,8,9}, 4));
    }

    @Test
    public void test3(){
        MinimumOperationsToReduceXToZero test = new MinimumOperationsToReduceXToZero();
        Assert.assertEquals(5, test.minOperations(new int[]{3,2,20,1,1,3}, 10));
    }

    @Test
    public void test4(){
        MinimumOperationsToReduceXToZero test = new MinimumOperationsToReduceXToZero();
        Assert.assertEquals(-1, test.minOperations(new int[]{1}, 5));
    }

    @Test
    public void test5(){
        MinimumOperationsToReduceXToZero test = new MinimumOperationsToReduceXToZero();
        Assert.assertEquals(4, test.minOperations(new int[]{2,1,1,1,1,1,1}, 5));
    }

    @Test
    public void test6(){
        MinimumOperationsToReduceXToZero test = new MinimumOperationsToReduceXToZero();
        Assert.assertEquals(7, test.minOperations(new int[]{2,1,1,1,1,1,1}, 8));
    }

}
