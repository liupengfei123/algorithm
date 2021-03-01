package lpf.learn.leetcode.tags.other;

import org.junit.Assert;
import org.junit.Test;

public class BulbSwitcherTest {
    @Test
    public void test1(){
        BulbSwitcher test = new BulbSwitcher();
        Assert.assertEquals(1, test.bulbSwitch(3));
    }


    @Test
    public void test2(){
        BulbSwitcher test = new BulbSwitcher();
        Assert.assertEquals(0, test.bulbSwitch(0));
    }

    @Test
    public void test3(){
        BulbSwitcher test = new BulbSwitcher();
        Assert.assertEquals(1, test.bulbSwitch(1));
    }

    @Test
    public void test4(){
        BulbSwitcher test = new BulbSwitcher();
        Assert.assertEquals(10, test.bulbSwitch(100));
    }

    @Test
    public void test5(){
        BulbSwitcher test = new BulbSwitcher();
        Assert.assertEquals(9999, test.bulbSwitch(99999999));
    }
}
