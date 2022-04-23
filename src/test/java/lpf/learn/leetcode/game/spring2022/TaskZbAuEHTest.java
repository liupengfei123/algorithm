package lpf.learn.leetcode.game.spring2022;

import org.junit.Assert;
import org.junit.Test;

public class TaskZbAuEHTest {
    @Test
    public void test1(){
        TaskZbAuEH test = new TaskZbAuEH();
        Assert.assertEquals(2, test.getMaximumNumber(new int[][]{{1,1,0},{2,0,1},{4,2,2}}));
    }

    @Test
    public void test2(){
        TaskZbAuEH test = new TaskZbAuEH();
        Assert.assertEquals(3, test.getMaximumNumber(new int[][]{{2,0,2},{5,2,0},{4,1,0},{1,2,1},{3,0,2}}));
    }

    @Test
    public void test3(){
        TaskZbAuEH test = new TaskZbAuEH();
        Assert.assertEquals(0, test.getMaximumNumber(new int[][]{{0,1,0},{0,0,1}}));
    }

    @Test
    public void test4(){
        TaskZbAuEH test = new TaskZbAuEH();
        Assert.assertEquals(2, test.getMaximumNumber(new int[][]{{0,1,0},{6,0,1},{10,2,2}}));
    }

    @Test
    public void test5(){
        TaskZbAuEH test = new TaskZbAuEH();
        Assert.assertEquals(3, test.getMaximumNumber(new int[][]{{0,1,0},{1,0,0},{2,0,0},{3,0,0},{6,2,2},{7,2,2}}));
    }
}
