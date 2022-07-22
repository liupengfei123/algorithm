package lpf.learn.leetcode.tags.greedy;

import org.junit.Assert;
import org.junit.Test;

public class SetIntersectionSizeAtLeastTwoTest {
    @Test
    public void test1(){
        SetIntersectionSizeAtLeastTwo test = new SetIntersectionSizeAtLeastTwo();
        Assert.assertEquals(3, test.intersectionSizeTwo(new int[][]{{1, 3},{1, 4},{2, 5},{3, 5}}));
    }

    @Test
    public void test2(){
        SetIntersectionSizeAtLeastTwo test = new SetIntersectionSizeAtLeastTwo();
        Assert.assertEquals(5, test.intersectionSizeTwo(new int[][]{{1, 2},{2, 3},{2, 4},{4, 5}}));
    }

    @Test
    public void test3(){
        SetIntersectionSizeAtLeastTwo test = new SetIntersectionSizeAtLeastTwo();
        Assert.assertEquals(5, test.intersectionSizeTwo(new int[][]{{70,90},{80,100},{90,110},{111,411},{200,300}}));
    }

    @Test
    public void test4(){
        SetIntersectionSizeAtLeastTwo test = new SetIntersectionSizeAtLeastTwo();
        Assert.assertEquals(5, test.intersectionSizeTwo(new int[][]{{70,90},{80,100},{90,111},{111,411},{200,300}}));
    }

    @Test
    public void test5(){
        SetIntersectionSizeAtLeastTwo test = new SetIntersectionSizeAtLeastTwo();
        Assert.assertEquals(16, test.intersectionSizeTwo(new int[][]{{2,3},{30,41},{10,14},{6,9},{19,24},{111,411},{200,300},{70,90},{80,100},{90,110},{12,27},{38,50},{1,8},{34,59},{67,76},{21,41},{22,23},{2,3},{1,4},{9,18},{2,7},{21,51},{31,52}}));
    }

    @Test
    public void test6(){
        SetIntersectionSizeAtLeastTwo test = new SetIntersectionSizeAtLeastTwo();
        Assert.assertEquals(7, test.intersectionSizeTwo(new int[][]{{1,3},{4,9},{0,10},{6,7},{1,2},{0,6},{7,9},{0,1},{2,5},{6,8}}));
    }
}
