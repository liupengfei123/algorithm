package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class SearchInsertTest {

    @Test
    public void pivotIndexTest(){
        SearchInsert searchInsert = new SearchInsert();

        Assert.assertEquals(2, searchInsert.searchInsert(new int[]{1,3,5,6}, 5));

        Assert.assertEquals(1, searchInsert.searchInsert(new int[]{1,3,5,6}, 2));

        Assert.assertEquals(4, searchInsert.searchInsert(new int[]{1,3,5,6}, 7));

        Assert.assertEquals(0, searchInsert.searchInsert(new int[]{1,3,5,6}, 0));


        Assert.assertEquals(0, searchInsert.searchInsert(new int[]{}, 0));
    }
}
