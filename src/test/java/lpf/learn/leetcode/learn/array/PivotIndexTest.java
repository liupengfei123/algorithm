package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class PivotIndexTest {

    @Test
    public void pivotIndexTest(){
        PivotIndex pivotIndex = new PivotIndex();

        Assert.assertEquals(3, pivotIndex.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));

        Assert.assertEquals(-1, pivotIndex.pivotIndex(new int[]{1, 2, 3, 6, 5, 6}));

        Assert.assertEquals(2, pivotIndex.pivotIndex(new int[]{-1, -1, 0, 0, -1, -1}));
    }



}
