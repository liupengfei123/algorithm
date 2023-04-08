package lpf.learn.leetcode.game.weekly339;

import org.junit.Assert;
import org.junit.Test;

public class MiceAndCheeseTest {
    @Test
    public void test1() {
        MiceAndCheese test = new MiceAndCheese();
        Assert.assertEquals(15, test.miceAndCheese(new int[]{1,1,3,4}, new int[]{4,4,1,1}, 2));
    }

    @Test
    public void test2() {
        MiceAndCheese test = new MiceAndCheese();
        Assert.assertEquals(2, test.miceAndCheese(new int[]{1,1}, new int[]{1,1}, 2));
    }
}
