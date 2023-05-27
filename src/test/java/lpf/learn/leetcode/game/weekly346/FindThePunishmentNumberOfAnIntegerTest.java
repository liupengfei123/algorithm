package lpf.learn.leetcode.game.weekly346;

import org.junit.Assert;
import org.junit.Test;

public class FindThePunishmentNumberOfAnIntegerTest {
    @Test
    public void test1(){
        FindThePunishmentNumberOfAnInteger test = new FindThePunishmentNumberOfAnInteger();
        Assert.assertEquals(182, test.punishmentNumber(10));
    }

    @Test
    public void test2(){
        FindThePunishmentNumberOfAnInteger test = new FindThePunishmentNumberOfAnInteger();
        Assert.assertEquals(1478, test.punishmentNumber(37));
    }
}
