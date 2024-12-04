package lpf.learn.leetcode.tags.twopoint;


import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicatesTest(){
        RemoveDuplicatesFromSortedArray removeDuplicates = new RemoveDuplicatesFromSortedArray();

        Assert.assertEquals(2, removeDuplicates.removeDuplicates(new int[]{1,1,2}));

        Assert.assertEquals(1, removeDuplicates.removeDuplicates(new int[]{1}));

        Assert.assertEquals(5, removeDuplicates.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));


    }
}
