package lpf.learn.leetcode.tags.graph;

import org.junit.Assert;
import org.junit.Test;

public class NetworkDelayTimeTest {
    @Test
    public void test1(){
        NetworkDelayTime test = new NetworkDelayTime();
        Assert.assertEquals(2, test.networkDelayTime(new int[][]{{2,1,1},{2,3,1},{3,4,1}}, 4,2));
    }

    @Test
    public void test2(){
        NetworkDelayTime test = new NetworkDelayTime();
        Assert.assertEquals(1, test.networkDelayTime(new int[][]{{1,2,1}}, 2,1));
    }

    @Test
    public void test3(){
        NetworkDelayTime test = new NetworkDelayTime();
        Assert.assertEquals(-1, test.networkDelayTime(new int[][]{{1,2,1}}, 2,2));
    }

}
