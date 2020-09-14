package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class NonDecreasingArrayTest {

    @Test
    public void test1(){
        NonDecreasingArray test = new NonDecreasingArray();
        Assert.assertFalse(test.checkPossibility(new int[]{4, 1, 2, 1}));
    }

    @Test
    public void test2(){
        NonDecreasingArray test = new NonDecreasingArray();
        Assert.assertTrue(test.checkPossibility(new int[]{4, 2, 3}));
    }

    @Test
    public void test3(){
        NonDecreasingArray test = new NonDecreasingArray();
        Assert.assertFalse(test.checkPossibility(new int[]{4,2,1}));
    }

    @Test
    public void test4(){
        NonDecreasingArray test = new NonDecreasingArray();
        Assert.assertFalse(test.checkPossibility(new int[]{3,4,2,3}));
    }

    @Test
    public void test5(){
        NonDecreasingArray test = new NonDecreasingArray();
        Assert.assertTrue(test.checkPossibility(new int[]{3, 9, 5, 6}));
    }

    @Test
    public void test6(){
        NonDecreasingArray test = new NonDecreasingArray();
        Assert.assertTrue(test.checkPossibility(new int[]{3, 4, 6, 9, 5, 10}));
    }
}
