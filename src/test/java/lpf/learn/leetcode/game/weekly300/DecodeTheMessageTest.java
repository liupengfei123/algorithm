package lpf.learn.leetcode.game.weekly300;

import org.junit.Assert;
import org.junit.Test;

public class DecodeTheMessageTest {

    @Test
    public void test1(){
        DecodeTheMessage test = new DecodeTheMessage();
        Assert.assertEquals("this is a secret", test.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

    @Test
    public void test2(){
        DecodeTheMessage test = new DecodeTheMessage();
        Assert.assertEquals("the five boxing wizards jump quickly", test.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }

    @Test
    public void test3(){

    }

    @Test
    public void test4(){

    }

}
