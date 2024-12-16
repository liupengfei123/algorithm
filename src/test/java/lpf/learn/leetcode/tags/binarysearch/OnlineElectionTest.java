package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class OnlineElectionTest {
    @Test
    public void test1(){
        OnlineElection test = new OnlineElection(new int[]{0,1,1,0,0,1,0}, new int[]{0,5,10,15,20,25,30});

        Assert.assertEquals(0, test.q(3));
        Assert.assertEquals(1, test.q(12));
        Assert.assertEquals(1, test.q(25));
        Assert.assertEquals(0, test.q(15));
        Assert.assertEquals(0, test.q(24));
        Assert.assertEquals(1, test.q(8));
    }

}
