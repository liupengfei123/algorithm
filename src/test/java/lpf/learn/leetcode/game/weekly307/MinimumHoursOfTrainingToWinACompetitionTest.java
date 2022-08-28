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

    @Test
    public void test3(){
        MinimumHoursOfTrainingToWinACompetition test = new MinimumHoursOfTrainingToWinACompetition();
        Assert.assertEquals(650, test.minNumberOfHours(94, 70,
                new int[]{58,47,100,71,47,6,92,82,35,16,50,15,42,5,2,45,22},
                new int[]{77,83,99,76,75,66,58,84,44,98,70,41,48,7,10,61,28}));
    }

}
