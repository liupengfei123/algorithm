package lpf.learn.leetcode.game.weekly289;

import org.junit.Assert;
import org.junit.Test;

public class MinimumRoundsToCompleteAllTasksTest {
    @Test
    public void test1(){
        MinimumRoundsToCompleteAllTasks test = new MinimumRoundsToCompleteAllTasks();
        Assert.assertEquals(4, test.minimumRounds(new int[]{2,2,3,3,2,4,4,4,4,4}));
    }

    @Test
    public void test2(){
        MinimumRoundsToCompleteAllTasks test = new MinimumRoundsToCompleteAllTasks();
        Assert.assertEquals(-1, test.minimumRounds(new int[]{2,3,3}));
    }

    @Test
    public void test3(){
        MinimumRoundsToCompleteAllTasks test = new MinimumRoundsToCompleteAllTasks();
        Assert.assertEquals(-1, test.minimumRounds(new int[]{2,3,3}));
    }
}
