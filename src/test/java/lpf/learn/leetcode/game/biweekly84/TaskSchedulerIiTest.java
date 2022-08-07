package lpf.learn.leetcode.game.biweekly84;

import org.junit.Assert;
import org.junit.Test;

public class TaskSchedulerIiTest {
    @Test
    public void test1(){
        TaskSchedulerIi test = new TaskSchedulerIi();
        Assert.assertEquals(5, test.taskSchedulerII(new int[]{1,2,3,4,5}, 3));
    }


    @Test
    public void test2(){
        TaskSchedulerIi test = new TaskSchedulerIi();
        Assert.assertEquals(6, test.taskSchedulerII(new int[]{5,8,8,5}, 2));
    }

    @Test
    public void test3(){
        TaskSchedulerIi test = new TaskSchedulerIi();
        Assert.assertEquals(9, test.taskSchedulerII(new int[]{1,2,1,2,3,1}, 3));
    }
}
