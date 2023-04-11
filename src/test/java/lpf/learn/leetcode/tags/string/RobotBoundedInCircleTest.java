package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class RobotBoundedInCircleTest {

    @Test
    public void test1() {
        RobotBoundedInCircle temp = new RobotBoundedInCircle();
        Assert.assertTrue(temp.isRobotBounded("GGLLGG"));
    }

    @Test
    public void test2() {
        RobotBoundedInCircle temp = new RobotBoundedInCircle();
        Assert.assertFalse(temp.isRobotBounded("GG"));
    }

    @Test
    public void test3() {
        RobotBoundedInCircle temp = new RobotBoundedInCircle();
        Assert.assertTrue(temp.isRobotBounded("GL"));
    }
}
