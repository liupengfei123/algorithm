package lpf.learn.leetcode.game.biweekly80;

import org.junit.Assert;
import org.junit.Test;

public class StrongPasswordCheckerIITest {
    @Test
    public void test1(){
        StrongPasswordCheckerII test = new StrongPasswordCheckerII();
        Assert.assertTrue(test.strongPasswordCheckerII("IloveLe3tcode!"));
    }

    @Test
    public void test2(){
        StrongPasswordCheckerII test = new StrongPasswordCheckerII();
        Assert.assertFalse(test.strongPasswordCheckerII("Me+You--IsMyDream!"));
    }

    @Test
    public void test3(){
        StrongPasswordCheckerII test = new StrongPasswordCheckerII();
        Assert.assertFalse(test.strongPasswordCheckerII("1aB!"));
    }
}
