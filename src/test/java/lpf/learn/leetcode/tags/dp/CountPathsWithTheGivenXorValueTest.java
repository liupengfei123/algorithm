package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class CountPathsWithTheGivenXorValueTest {
    @Test
    public void test1(){
        CountPathsWithTheGivenXorValue test = new CountPathsWithTheGivenXorValue();
        Assert.assertEquals(3, test.countPathsWithXorValue(new int[][]{{2,1,5},{7,10,0},{12,6,4}}, 11));
    }

    @Test
    public void test2(){
        CountPathsWithTheGivenXorValue test = new CountPathsWithTheGivenXorValue();
        Assert.assertEquals(5, test.countPathsWithXorValue(new int[][]{{1,3,3,3},{0,3,3,2},{3,0,1,1}}, 2));
    }

    @Test
    public void test3(){
        CountPathsWithTheGivenXorValue test = new CountPathsWithTheGivenXorValue();
        Assert.assertEquals(0, test.countPathsWithXorValue(new int[][]{{1,1,1,2},{3,0,3,2},{3,0,2,2}}, 10));
    }

}
