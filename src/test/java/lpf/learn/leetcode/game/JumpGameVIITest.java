package lpf.learn.leetcode.game;

import org.junit.Assert;
import org.junit.Test;

public class JumpGameVIITest {
    @Test
    public void test1(){
        JumpGameVII test = new JumpGameVII();
        Assert.assertEquals(true, test.canReach("011010", 2,3));
    }

    @Test
    public void test2(){
        JumpGameVII test = new JumpGameVII();
        Assert.assertEquals(false, test.canReach("01101110", 2,3));
    }

    @Test
    public void test3(){
        JumpGameVII test = new JumpGameVII();
        Assert.assertEquals(false, test.canReach("01", 1,1));
    }

    @Test
    public void test4(){
        JumpGameVII test = new JumpGameVII();
        Assert.assertEquals(true, test.canReach("011010", 2,3));
    }
}
