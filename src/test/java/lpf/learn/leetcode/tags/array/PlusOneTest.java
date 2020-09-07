package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class PlusOneTest {

    @Test
    public void test1(){
        PlusOne test = new PlusOne();
        Assert.assertArrayEquals(new int[]{1, 4, 3, 3}, test.plusOne(new int[]{1, 4, 3, 2}));
    }

    @Test
    public void test2(){
        PlusOne test = new PlusOne();
        Assert.assertArrayEquals(new int[]{1, 4, 4, 0}, test.plusOne(new int[]{1, 4, 3, 9}));
    }

    @Test
    public void test3(){
        PlusOne test = new PlusOne();
        Assert.assertArrayEquals(new int[]{1, 0, 0, 0, 0}, test.plusOne(new int[]{9, 9, 9, 9}));
    }
}
