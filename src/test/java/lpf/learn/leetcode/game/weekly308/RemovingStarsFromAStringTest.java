package lpf.learn.leetcode.game.weekly308;

import org.junit.Assert;
import org.junit.Test;

public class RemovingStarsFromAStringTest {
    @Test
    public void test1(){
        RemovingStarsFromAString test = new RemovingStarsFromAString();
        Assert.assertEquals("lecoe", test.removeStars("leet**cod*e"));
    }

    @Test
    public void test2(){
        RemovingStarsFromAString test = new RemovingStarsFromAString();
        Assert.assertEquals("", test.removeStars("erase*****"));
    }
}
