package lpf.learn.leetcode.game.weekly346;

import org.junit.Assert;
import org.junit.Test;

public class MinimumStringLengthAfterRemovingSubstringsTest {

    @Test
    public void test1(){
        MinimumStringLengthAfterRemovingSubstrings test = new MinimumStringLengthAfterRemovingSubstrings();
        Assert.assertEquals(2, test.minLength("ABFCACDB"));
    }

    @Test
    public void test2(){
        MinimumStringLengthAfterRemovingSubstrings test = new MinimumStringLengthAfterRemovingSubstrings();
        Assert.assertEquals(5, test.minLength("ACBBD"));
    }
}
