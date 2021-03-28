package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class TwoKeysKeyboardTest {
    @Test
    public void test1(){
        TwoKeysKeyboard test = new TwoKeysKeyboard();
        Assert.assertEquals(3, test.minSteps(3));
    }

    @Test
    public void test2(){
        TwoKeysKeyboard test = new TwoKeysKeyboard();
        Assert.assertEquals(4, test.minSteps(4));
    }

    @Test
    public void test3(){
        TwoKeysKeyboard test = new TwoKeysKeyboard();
        Assert.assertEquals(0, test.minSteps(1));
    }

    @Test
    public void test4(){
        TwoKeysKeyboard test = new TwoKeysKeyboard();
        Assert.assertEquals(6, test.minSteps(8));
    }

    @Test
    public void test5(){
        TwoKeysKeyboard test = new TwoKeysKeyboard();
        Assert.assertEquals(9, test.minSteps(27));
    }

    @Test
    public void test6(){
        TwoKeysKeyboard test = new TwoKeysKeyboard();
        Assert.assertEquals(20, test.minSteps(800));
    }
}
