package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class MinimumNumberOfFlipsToMakeTheBinaryStringAlternatingTest {

    @Test
    public void test1(){
        MinimumNumberOfFlipsToMakeTheBinaryStringAlternating test = new MinimumNumberOfFlipsToMakeTheBinaryStringAlternating();
        Assert.assertEquals(2, test.minFlips("111000"));
    }

    @Test
    public void test2(){
        MinimumNumberOfFlipsToMakeTheBinaryStringAlternating test = new MinimumNumberOfFlipsToMakeTheBinaryStringAlternating();
        Assert.assertEquals(0, test.minFlips("010"));
    }

    @Test
    public void test3(){
        MinimumNumberOfFlipsToMakeTheBinaryStringAlternating test = new MinimumNumberOfFlipsToMakeTheBinaryStringAlternating();
        Assert.assertEquals(1, test.minFlips("1110"));
    }

    @Test
    public void test4(){
        MinimumNumberOfFlipsToMakeTheBinaryStringAlternating test = new MinimumNumberOfFlipsToMakeTheBinaryStringAlternating();
        Assert.assertEquals(2, test.minFlips("01001001101"));
    }

}
