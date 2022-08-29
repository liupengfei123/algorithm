package lpf.learn.leetcode.game.weekly307;

import org.junit.Assert;
import org.junit.Test;

public class MinimumHoursOfTrainingToWinACompetitionTest {
    @Test
    public void test1(){
        MinimumHoursOfTrainingToWinACompetition test = new MinimumHoursOfTrainingToWinACompetition();
        Assert.assertEquals(8, test.minNumberOfHours(5, 3, new int[]{1,4,3,2}, new int[]{2,6,3,1}));
    }

    @Test
    public void test2(){
        MinimumHoursOfTrainingToWinACompetition test = new MinimumHoursOfTrainingToWinACompetition();
        Assert.assertEquals(51, test.minNumberOfHours(1, 1, new int[]{1,1,1,1}, new int[]{1,1,1,50}));
    }
}
