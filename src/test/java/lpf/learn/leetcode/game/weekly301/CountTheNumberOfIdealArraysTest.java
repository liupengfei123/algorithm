package lpf.learn.leetcode.game.weekly301;

import org.junit.Assert;
import org.junit.Test;

public class CountTheNumberOfIdealArraysTest {

    @Test
    public void test1() {
        CountTheNumberOfIdealArrays test = new CountTheNumberOfIdealArrays();
        Assert.assertEquals(10, test.idealArrays(2, 5));
    }


    @Test
    public void test2() {
        CountTheNumberOfIdealArrays test = new CountTheNumberOfIdealArrays();
        Assert.assertEquals(11, test.idealArrays(5, 3));
    }


    @Test
    public void test3() {
        CountTheNumberOfIdealArrays test = new CountTheNumberOfIdealArrays();
        Assert.assertEquals(1998089, test.idealArrays(9767, 9557));
    }

    @Test
    public void test4() {
        CountTheNumberOfIdealArrays test = new CountTheNumberOfIdealArrays();
        Assert.assertEquals(27, test.idealArrays(2, 10));
    }
}
