package lpf.learn.leetcode.tags.backtrack;

import org.junit.Assert;
import org.junit.Test;

public class FindMinimumTimeToFinishAllJobsTest {
    @Test
    public void test1(){
        FindMinimumTimeToFinishAllJobs test = new FindMinimumTimeToFinishAllJobs();
        Assert.assertEquals(8, test.minimumTimeRequired(new int[]{3,2,3}, 1));
    }

    @Test
    public void test2(){
        FindMinimumTimeToFinishAllJobs test = new FindMinimumTimeToFinishAllJobs();
        Assert.assertEquals(3, test.minimumTimeRequired(new int[]{3,2,3}, 3));
    }

    @Test
    public void test4(){
        FindMinimumTimeToFinishAllJobs test = new FindMinimumTimeToFinishAllJobs();
        Assert.assertEquals(11, test.minimumTimeRequired(new int[]{1,2,4,7,8}, 2));
    }

    @Test
    public void test5(){
        FindMinimumTimeToFinishAllJobs test = new FindMinimumTimeToFinishAllJobs();
        Assert.assertEquals(101, test.minimumTimeRequired(new int[]{44,12,53,35,12,99,101,24,14,47,3,71}, 6));
    }

    @Test
    public void test6(){
        FindMinimumTimeToFinishAllJobs test = new FindMinimumTimeToFinishAllJobs();
        Assert.assertEquals(101, test.minimumTimeRequired(new int[]{44,12,53,35,12,99,101,24,14,47,3,71}, 6));
    }

    @Test
    public void test7(){
        FindMinimumTimeToFinishAllJobs test = new FindMinimumTimeToFinishAllJobs();
        Assert.assertEquals(101, test.minimumTimeRequired(new int[]{44,12,53,35,12,99,101,24,94,47,40,71}, 8));
    }

    @Test
    public void test8(){
        FindMinimumTimeToFinishAllJobs test = new FindMinimumTimeToFinishAllJobs();
        Assert.assertEquals(94, test.minimumTimeRequired(new int[]{44,12,53,35,12,49,71,24,94,47,40,71}, 8));
    }

    @Test
    public void test9(){
        FindMinimumTimeToFinishAllJobs test = new FindMinimumTimeToFinishAllJobs();
        Assert.assertEquals(141, test.minimumTimeRequired(new int[]{44,12,53,35,12,49,71,24,94,47,40,71}, 4));
    }
}
