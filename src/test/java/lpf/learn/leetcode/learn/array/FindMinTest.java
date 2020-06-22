package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class FindMinTest {

    @Test
    public void findMinTest(){
        FindMin findMin = new FindMin();

        Assert.assertEquals(0, findMin.findMin(new int[]{0,1,2,4,5,6,7}));

        Assert.assertEquals(1, findMin.findMin(new int[]{3,4,5,1,2}));

        Assert.assertEquals(0, findMin.findMin(new int[]{4,5,6,7,0,1,2}));


    }
}
