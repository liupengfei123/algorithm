package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class CountSubstringsThatSatisfyKConstraintIiTest {
    @Test
    public void test1(){
        CountSubstringsThatSatisfyKConstraintIi test = new CountSubstringsThatSatisfyKConstraintIi();
        Assert.assertArrayEquals(new long[]{26}, test.countKConstraintSubstrings("0001111", 2 ,new int[][]{{0,6}}));
    }

    @Test
    public void test2(){
        CountSubstringsThatSatisfyKConstraintIi test = new CountSubstringsThatSatisfyKConstraintIi();
        Assert.assertArrayEquals(new long[]{15,9,3}, test.countKConstraintSubstrings("010101", 1 ,new int[][]{{0,5},{1,4},{2,3}}));
    }


    @Test
    public void test3(){
        CountSubstringsThatSatisfyKConstraintIi test = new CountSubstringsThatSatisfyKConstraintIi();
        Assert.assertArrayEquals(new long[]{1,1,1}, test.countKConstraintSubstrings("010101", 1 ,new int[][]{{0,0},{1,1},{2,2}}));
    }


    @Test
    public void test4(){
        CountSubstringsThatSatisfyKConstraintIi test = new CountSubstringsThatSatisfyKConstraintIi();
        Assert.assertArrayEquals(new long[]{43,35}, test.countKConstraintSubstrings("001110001", 3 ,new int[][]{{0,8},{1,8}}));
    }

}