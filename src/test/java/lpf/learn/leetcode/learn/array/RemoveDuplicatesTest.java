package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {

    @Test
    public void removeDuplicatesTest(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();

        Assert.assertEquals(2, removeDuplicates.removeDuplicates(new int[]{1,1,2}));

        Assert.assertEquals(1, removeDuplicates.removeDuplicates(new int[]{1}));

        Assert.assertEquals(5, removeDuplicates.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));


    }
}
