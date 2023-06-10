package lpf.learn.leetcode.game.weekly348;

import org.junit.Assert;
import org.junit.Test;

public class SemiOrderedPermutationTest {
    @Test
    public void test1(){
        SemiOrderedPermutation test = new SemiOrderedPermutation();
        Assert.assertEquals(2, test.semiOrderedPermutation(new int[]{2,1,4,3}));
    }

    @Test
    public void test2(){
        SemiOrderedPermutation test = new SemiOrderedPermutation();
        Assert.assertEquals(3, test.semiOrderedPermutation(new int[]{2,4,1,3}));
    }

    @Test
    public void test3(){
        SemiOrderedPermutation test = new SemiOrderedPermutation();
        Assert.assertEquals(0, test.semiOrderedPermutation(new int[]{1,3,4,2,5}));
    }
}
