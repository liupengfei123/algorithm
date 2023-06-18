package lpf.learn.leetcode.game.biweekly106;

import org.junit.Assert;
import org.junit.Test;

public class MovementOfRobotsTest {
    @Test
    public void test1(){
        MovementOfRobots test = new MovementOfRobots();
        Assert.assertEquals(8, test.sumDistance(new int[]{-2, 0, 2}, "RLL",3));
    }

    @Test
    public void test2(){
        MovementOfRobots test = new MovementOfRobots();
        Assert.assertEquals(146, test.sumDistance(new int[]{-10,-13,10,14,11}, "LRLLR",2));
    }
}