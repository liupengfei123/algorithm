package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class FindKThSmallestPairDistanceTest {
    @Test
    public void test1(){
        FindKThSmallestPairDistance test = new FindKThSmallestPairDistance();
        Assert.assertEquals(0, test.smallestDistancePair(new int[]{1,3,1}, 1));
    }

    @Test
    public void test2(){
        FindKThSmallestPairDistance test = new FindKThSmallestPairDistance();
        Assert.assertEquals(0, test.smallestDistancePair(new int[]{1,1,1}, 2));
    }

    @Test
    public void test3(){
        FindKThSmallestPairDistance test = new FindKThSmallestPairDistance();
        Assert.assertEquals(5, test.smallestDistancePair(new int[]{1,6,1}, 3));
    }

    @Test
    public void test4(){
        FindKThSmallestPairDistance test = new FindKThSmallestPairDistance();
        Assert.assertEquals(1, test.smallestDistancePair(new int[]{1,4,1,7,5,8,7,12,3,9,2,3,15,21,6,7,8}, 17));
    }

    @Test
    public void test5(){
        FindKThSmallestPairDistance test = new FindKThSmallestPairDistance();
        Assert.assertEquals(7, test.smallestDistancePair(new int[]{12,4,73,46,347,3,27,8,3,88,53,57,22,24,77,34,27,57}, 19));
    }
}
