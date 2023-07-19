package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class WalkingRobotSimulationTest {

    @Test
    public void test1(){
        WalkingRobotSimulation test = new WalkingRobotSimulation();
        Assert.assertEquals(25, test.robotSim(new int[]{4,-1,3}, new int[][]{}));

    }

    @Test
    public void test2(){
        WalkingRobotSimulation test = new WalkingRobotSimulation();
        Assert.assertEquals(65, test.robotSim(new int[]{4,-1,4,-2,4}, new int[][]{{2,4}}));
    }

    @Test
    public void test3(){
        WalkingRobotSimulation test = new WalkingRobotSimulation();
        Assert.assertEquals(36, test.robotSim(new int[]{6,-1,-1,6}, new int[][]{{2,4}}));
    }

    @Test
    public void test4(){
        WalkingRobotSimulation test = new WalkingRobotSimulation();
        Assert.assertEquals(324, test.robotSim(new int[]{-2,8,3,7,-1}, new int[][]{{-4,-1},{1,-1},{1,4},{5,0},{4,5},{-2,-1},{2,-5},{5,1},{-3,-1},{5,-3}}));
    }
}
