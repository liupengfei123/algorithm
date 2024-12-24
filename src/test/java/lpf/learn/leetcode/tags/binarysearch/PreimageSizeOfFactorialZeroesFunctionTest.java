package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class PreimageSizeOfFactorialZeroesFunctionTest {

    @Test
    public void test1(){
        PreimageSizeOfFactorialZeroesFunction test = new PreimageSizeOfFactorialZeroesFunction();
        Assert.assertEquals(5, test.preimageSizeFZF(0));
    }

    @Test
    public void test2(){
        PreimageSizeOfFactorialZeroesFunction test = new PreimageSizeOfFactorialZeroesFunction();
        Assert.assertEquals(0, test.preimageSizeFZF(5));
    }

    @Test
    public void test3(){
        PreimageSizeOfFactorialZeroesFunction test = new PreimageSizeOfFactorialZeroesFunction();
        Assert.assertEquals(5, test.preimageSizeFZF(3));
    }

    @Test
    public void test4(){
        PreimageSizeOfFactorialZeroesFunction test = new PreimageSizeOfFactorialZeroesFunction();
        Assert.assertEquals(5, test.preimageSizeFZF(10));
    }

    @Test
    public void test5(){
        PreimageSizeOfFactorialZeroesFunction test = new PreimageSizeOfFactorialZeroesFunction();
        Assert.assertEquals(5, test.preimageSizeFZF(11777));
    }

    @Test
    public void test6(){
        PreimageSizeOfFactorialZeroesFunction test = new PreimageSizeOfFactorialZeroesFunction();
        Assert.assertEquals(5, test.preimageSizeFZF(1000000000));
    }
}
