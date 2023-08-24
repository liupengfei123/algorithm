package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class CountServersThatCommunicateTest {

    @Test
    public void test1(){
        CountServersThatCommunicate test = new CountServersThatCommunicate();
        Assert.assertEquals(0, test.countServers(new int[][]{{1,0},{0,1}}));
    }

    @Test
    public void test2(){
        CountServersThatCommunicate test = new CountServersThatCommunicate();
        Assert.assertEquals(3, test.countServers(new int[][]{{1,0},{1,1}}));
    }

    @Test
    public void test3(){
        CountServersThatCommunicate test = new CountServersThatCommunicate();
        Assert.assertEquals(4, test.countServers(new int[][]{{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}}));
    }

}
