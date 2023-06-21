package lpf.learn.leetcode.game.weekly350;

import org.junit.Assert;
import org.junit.Test;

public class SpecialPermutationsTest {
    @Test
    public void test1(){
        SpecialPermutations test = new SpecialPermutations();
        Assert.assertEquals(2, test.specialPerm(new int[]{2,3,6}));
    }

    @Test
    public void test2(){
        SpecialPermutations test = new SpecialPermutations();
        Assert.assertEquals(2, test.specialPerm(new int[]{1,4,3}));
    }


    @Test
    public void test3(){
        SpecialPermutations test = new SpecialPermutations();
        Assert.assertEquals(362880, test.specialPerm(new int[]{1,2,4,8,16,32,64,128,256}));
    }

    @Test
    public void test4(){
        SpecialPermutations test = new SpecialPermutations();
        Assert.assertEquals(178290591, test.specialPerm(new int[]{1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192}));
    }
}
