package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-05-09 18:17
 */
public class ValidPerfectSquareTest {
    @Test
    public void test1(){
        ValidPerfectSquare test = new ValidPerfectSquare();
        Assert.assertTrue(test.isPerfectSquare(9));
    }

    @Test
    public void test2(){
        ValidPerfectSquare test = new ValidPerfectSquare();
        Assert.assertTrue(test.isPerfectSquare(4));
    }

    @Test
    public void test3(){
        ValidPerfectSquare test = new ValidPerfectSquare();
        Assert.assertTrue(test.isPerfectSquare(16));
    }

    @Test
    public void test4(){
        ValidPerfectSquare test = new ValidPerfectSquare();
        Assert.assertFalse(test.isPerfectSquare(14));
    }

    @Test
    public void test5(){
        ValidPerfectSquare test = new ValidPerfectSquare();
        Assert.assertTrue(test.isPerfectSquare(1));
    }

    @Test
    public void test6(){
        ValidPerfectSquare test = new ValidPerfectSquare();
        Assert.assertTrue(test.isPerfectSquare(808201));
    }

}
