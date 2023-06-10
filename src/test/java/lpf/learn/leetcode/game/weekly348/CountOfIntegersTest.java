package lpf.learn.leetcode.game.weekly348;

import org.junit.Assert;
import org.junit.Test;

public class CountOfIntegersTest {
    @Test
    public void test1(){
        CountOfIntegers test = new CountOfIntegers();
        Assert.assertEquals(11, test.count("1", "12", 1, 8));
    }

    @Test
    public void test2(){
        CountOfIntegers test = new CountOfIntegers();
        Assert.assertEquals(5, test.count("1", "5", 1, 5));
    }

    @Test
    public void test3(){
        CountOfIntegers test = new CountOfIntegers();
        Assert.assertEquals(195633498, test.count("10000", "199122412", 20, 399));
    }

    @Test
    public void test4(){
        CountOfIntegers test = new CountOfIntegers();
        Assert.assertEquals(4307, test.count("122", "5000", 10, 321));
    }

    @Test
    public void test5(){
        CountOfIntegers test = new CountOfIntegers();
        Assert.assertEquals(883045899, test.count("4179205230", "7748704426", 8, 46));
    }
}
