package lpf.learn.leetcode.game.weekly348;

import org.junit.Assert;
import org.junit.Test;

public class MinimizeStringLengthTest {
    @Test
    public void test1(){
        MinimizeStringLength test = new MinimizeStringLength();
        Assert.assertEquals(3, test.minimizedStringLength("aaabc"));
    }

    @Test
    public void test2(){
        MinimizeStringLength test = new MinimizeStringLength();
        Assert.assertEquals(3, test.minimizedStringLength("cbbd"));
    }

    @Test
    public void test3(){
        MinimizeStringLength test = new MinimizeStringLength();
        Assert.assertEquals(2, test.minimizedStringLength("dddaaa"));
    }
}
