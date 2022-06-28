package lpf.learn.leetcode.game.biweekly81;

import org.junit.Assert;
import org.junit.Test;

public class CountAsterisksTest {

    @Test
    public void test1(){
        CountAsterisks test = new CountAsterisks();
        Assert.assertEquals(2, test.countAsterisks("l|*e*et|c**o|*de|"));
    }

    @Test
    public void test2(){
        CountAsterisks test = new CountAsterisks();
        Assert.assertEquals(0, test.countAsterisks("iamprogrammer"));
    }

    @Test
    public void test3(){
        CountAsterisks test = new CountAsterisks();
        Assert.assertEquals(5, test.countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
    }
}
