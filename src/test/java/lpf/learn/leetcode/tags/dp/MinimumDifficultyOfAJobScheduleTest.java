package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class MinimumDifficultyOfAJobScheduleTest {
    @Test
    public void test1(){
        MinimumDifficultyOfAJobSchedule test = new MinimumDifficultyOfAJobSchedule();
        Assert.assertEquals(7, test.minDifficulty(new int[]{1, 2, 3, 4},3));
    }

    @Test
    public void test2(){
        MinimumDifficultyOfAJobSchedule test = new MinimumDifficultyOfAJobSchedule();
        Assert.assertEquals(5, test.minDifficulty(new int[]{1, 2, 3, 4},2));
    }

    @Test
    public void test3(){
        MinimumDifficultyOfAJobSchedule test = new MinimumDifficultyOfAJobSchedule();
        Assert.assertEquals(7, test.minDifficulty(new int[]{6,5,4,3,2,1},2));
    }

    @Test
    public void test4(){
        MinimumDifficultyOfAJobSchedule test = new MinimumDifficultyOfAJobSchedule();
        Assert.assertEquals(-1, test.minDifficulty(new int[]{9,9,9},4));
    }

    @Test
    public void test5(){
        MinimumDifficultyOfAJobSchedule test = new MinimumDifficultyOfAJobSchedule();
        Assert.assertEquals(3, test.minDifficulty(new int[]{1,1,1},3));
    }

    @Test
    public void test6(){
        MinimumDifficultyOfAJobSchedule test = new MinimumDifficultyOfAJobSchedule();
        Assert.assertEquals(15, test.minDifficulty(new int[]{7,1,7,1,7,1},3));
    }

    @Test
    public void test7(){
        MinimumDifficultyOfAJobSchedule test = new MinimumDifficultyOfAJobSchedule();
        Assert.assertEquals(843, test.minDifficulty(new int[]{11,111,22,222,33,333,44,444},6));
    }

    @Test
    public void test8(){
        MinimumDifficultyOfAJobSchedule test = new MinimumDifficultyOfAJobSchedule();
        Assert.assertEquals(5, test.minDifficulty(new int[]{1, 2, 3, 4},2));
    }

    @Test
    public void test9(){
        MinimumDifficultyOfAJobSchedule test = new MinimumDifficultyOfAJobSchedule();
        Assert.assertEquals(5, test.minDifficulty(new int[]{1, 2, 3, 4},2));
    }
}
