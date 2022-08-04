package lpf.learn.leetcode.game.weekly304;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfGroupsEnteringACompetitionTest {
    @Test
    public void test1(){
        MaximumNumberOfGroupsEnteringACompetition test = new MaximumNumberOfGroupsEnteringACompetition();
        Assert.assertEquals(2, test.maximumGroups(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test2(){
        MaximumNumberOfGroupsEnteringACompetition test = new MaximumNumberOfGroupsEnteringACompetition();
        Assert.assertEquals(1, test.maximumGroups(new int[]{1,2}));
    }

    @Test
    public void test3(){
        MaximumNumberOfGroupsEnteringACompetition test = new MaximumNumberOfGroupsEnteringACompetition();
        Assert.assertEquals(3, test.maximumGroups(new int[]{10,6,12,7,3,5}));
    }
}
