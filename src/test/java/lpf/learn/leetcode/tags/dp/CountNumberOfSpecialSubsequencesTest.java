package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class CountNumberOfSpecialSubsequencesTest {
    
    @Test
    public void test1(){
        CountNumberOfSpecialSubsequences test = new CountNumberOfSpecialSubsequences();
        Assert.assertEquals(3, test.countSpecialSubsequences(new int[]{0,1,2,2}));
    }

    @Test
    public void test2(){
        CountNumberOfSpecialSubsequences test = new CountNumberOfSpecialSubsequences();
        Assert.assertEquals(0, test.countSpecialSubsequences(new int[]{2,2,0,0}));
    }

    @Test
    public void test3(){
        CountNumberOfSpecialSubsequences test = new CountNumberOfSpecialSubsequences();
        Assert.assertEquals(0, test.countSpecialSubsequences(new int[]{0,2,1,0,0}));
    }

    @Test
    public void test4(){
        CountNumberOfSpecialSubsequences test = new CountNumberOfSpecialSubsequences();
        Assert.assertEquals(7, test.countSpecialSubsequences(new int[]{0,1,2,0,1,2}));
    }

    @Test
    public void test5(){
        CountNumberOfSpecialSubsequences test = new CountNumberOfSpecialSubsequences();
        Assert.assertEquals(5, test.countSpecialSubsequences(new int[]{0,1,0,1,2}));
    }

    @Test
    public void test6(){
        CountNumberOfSpecialSubsequences test = new CountNumberOfSpecialSubsequences();
        Assert.assertEquals(155, test.countSpecialSubsequences(new int[]{0,1,1,1,2,0,2,1,2,1,2}));
    }
    @Test
    public void test7(){
        CountNumberOfSpecialSubsequences test = new CountNumberOfSpecialSubsequences();
        Assert.assertEquals(251658575, test.countSpecialSubsequences(new int[]{0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,2,1,2,1,2}));
    }

    @Test
    public void test8(){
        CountNumberOfSpecialSubsequences test = new CountNumberOfSpecialSubsequences();
        Assert.assertEquals(634363310, test.countSpecialSubsequences(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,2,1,2,1,2}));
    }
}
