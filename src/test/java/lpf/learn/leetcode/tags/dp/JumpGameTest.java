package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class JumpGameTest {
    @Test
    public void test1(){
        JumpGame test = new JumpGame();
        Assert.assertTrue(test.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void test2(){
        JumpGame test = new JumpGame();
        Assert.assertTrue(test.canJump(new int[]{2, 3, 0, 0, 4}));
    }

    @Test
    public void test3(){
        JumpGame test = new JumpGame();
        Assert.assertTrue(test.canJump(new int[]{2, 30, 0, 0, 4}));
    }

    @Test
    public void test4(){
        JumpGame test = new JumpGame();
        Assert.assertFalse(test.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}
