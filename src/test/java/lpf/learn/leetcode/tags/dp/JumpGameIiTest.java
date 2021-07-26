package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class JumpGameIiTest {
    @Test
    public void test1(){
        JumpGameIi test = new JumpGameIi();
        Assert.assertEquals(2, test.jump(new int[]{2,3,1,1,4}));
    }

    @Test
    public void test2(){
        JumpGameIi test = new JumpGameIi();
        Assert.assertEquals(2, test.jump(new int[]{2,3,0,0,4}));
    }

    @Test
    public void test3(){
        JumpGameIi test = new JumpGameIi();
        Assert.assertEquals(9, test.jump(new int[]{1,1,1,1,1,1,1,1,1,1}));
    }
}
