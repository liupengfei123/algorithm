package lpf.learn.leetcode.game.weekly354;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MinimumIndexOfAValidSplitTest {
    @Test
    public void test1(){
        MinimumIndexOfAValidSplit test = new MinimumIndexOfAValidSplit();
        Assert.assertEquals(2, test.minimumIndex(Arrays.asList(1,2,2,2)));
    }

    @Test
    public void test2(){
        MinimumIndexOfAValidSplit test = new MinimumIndexOfAValidSplit();
        Assert.assertEquals(4, test.minimumIndex(Arrays.asList(2,1,3,1,1,1,7,1,2,1)));
    }

    @Test
    public void test3(){
        MinimumIndexOfAValidSplit test = new MinimumIndexOfAValidSplit();
        Assert.assertEquals(-1, test.minimumIndex(Arrays.asList(3,3,3,3,7,2,2)));
    }


    @Test
    public void test4(){
        MinimumIndexOfAValidSplit test = new MinimumIndexOfAValidSplit();
        Assert.assertEquals(-1, test.minimumIndex(Arrays.asList(9,5,5,1,1,1,1,8,1)));
    }
}
