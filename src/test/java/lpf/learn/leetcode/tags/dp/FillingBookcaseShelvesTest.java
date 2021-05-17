package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class FillingBookcaseShelvesTest {
    @Test
    public void test1(){
        FillingBookcaseShelves test = new FillingBookcaseShelves();
        Assert.assertEquals(6, test.minHeightShelves(new int[][]{{1,1},{2,3},{2,3},{1,1},{1,1},{1,1},{1,2}}, 4));
    }
}
