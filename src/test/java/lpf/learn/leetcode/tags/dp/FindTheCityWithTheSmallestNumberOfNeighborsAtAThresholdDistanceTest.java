package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistanceTest {

    @Test
    public void test1(){
        FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance test = new FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance();
        Assert.assertEquals(3, test.findTheCity(4, new int[][]{{0,1,3},{1,2,1},{1,3,4},{2,3,1}}, 4));
    }

    @Test
    public void test2(){
        FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance test = new FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance();
        Assert.assertEquals(0, test.findTheCity(5, new int[][]{{0,1,2},{0,4,8},{1,2,3},{1,4,2},{2,3,1},{3,4,1}}, 2));
    }

    @Test
    public void test3(){
        FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance test = new FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance();
        Assert.assertEquals(5, test.findTheCity(6, new int[][]{{2,3,7},{2,5,8},{0,2,8},{4,5,5},{1,5,10},{3,4,3},{0,5,9},{1,2,1}}, 3269));
    }

    @Test
    public void test4(){
        FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance test = new FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance();
        Assert.assertEquals(2, test.findTheCity(5, new int[][]{{0,1,2},{0,4,8},{1,2,10000},{1,4,2},{2,3,10000},{3,4,1}}, 10000));
    }

    @Test
    public void test5(){
        FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance test = new FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance();
        Assert.assertEquals(7, test.findTheCity(8, new int[][]{{3,5,9558},{1,2,1079},{1,3,8040},{0,1,9258},{4,7,7558},{5,6,8196},{3,4,7284},{1,5,6327},{0,4,5966},{3,6,8575},{2,5,8604},{1,7,7782},{4,6,2857},{3,7,2336},{0,6,6},{5,7,2870},{4,5,5055},{0,7,2904},{1,6,2458},{0,5,3399},{6,7,2202},{0,2,3996},{0,3,7495},{1,4,2262},{2,6,1390}}, 7937));
    }
}
