package lpf.learn.leetcode.game.spring2022;

import org.junit.Assert;
import org.junit.Test;

public class TaskPTXy4PTest {
    @Test
    public void test1(){
        TaskPTXy4P test = new TaskPTXy4P();
        Assert.assertEquals(10, test.getMinimumTime(new int[]{2,3,2}, new int[][]{{0,2},{1,4},{2,1}}, 3));
    }

    @Test
    public void test2(){
        TaskPTXy4P test = new TaskPTXy4P();
        Assert.assertEquals(5, test.getMinimumTime(new int[]{1}, new int[][]{{0,3},{0,5}}, 2));
    }


}
