package lpf.learn.leetcode.game.weekly353;

import org.junit.Assert;
import org.junit.Test;

public class FindTheMaximumAchievableNumberTest {
    @Test
    public void test1(){
        FindTheMaximumAchievableNumber test = new FindTheMaximumAchievableNumber();
        Assert.assertEquals(6, test.theMaximumAchievableX(4, 1));
    }

    @Test
    public void test2(){
        FindTheMaximumAchievableNumber test = new FindTheMaximumAchievableNumber();
        Assert.assertEquals(7, test.theMaximumAchievableX(3, 2));
    }
}
