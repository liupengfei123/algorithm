package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class BestTeamWithNoConflictsTest {

    @Test
    public void test1(){
        BestTeamWithNoConflicts test = new BestTeamWithNoConflicts();
        Assert.assertEquals(34, test.bestTeamScore(new int[]{1,3,5,10,15}, new int[]{1,2,3,4,5}));
    }

    @Test
    public void test2(){
        BestTeamWithNoConflicts test = new BestTeamWithNoConflicts();
        Assert.assertEquals(16, test.bestTeamScore(new int[]{4,5,6,5}, new int[]{2,1,2,1}));
    }

    @Test
    public void test3(){
        BestTeamWithNoConflicts test = new BestTeamWithNoConflicts();
        Assert.assertEquals(6, test.bestTeamScore(new int[]{1,2,3,5}, new int[]{8,9,10,1}));
    }

    @Test
    public void test4(){
        BestTeamWithNoConflicts test = new BestTeamWithNoConflicts();
        Assert.assertEquals(1, test.bestTeamScore(new int[]{1}, new int[]{4}));
    }
}
