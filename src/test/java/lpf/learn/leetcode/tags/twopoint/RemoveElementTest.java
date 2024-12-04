package lpf.learn.leetcode.tags.twopoint;


import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {

    @Test
    public void removeElementTest(){
        RemoveElement removeElement = new RemoveElement();

        Assert.assertEquals(3, removeElement.removeElement(new int[]{1,4,3,2}, 4));

        Assert.assertEquals(2, removeElement.removeElement(new int[]{3,2,2,3}, 3));

        Assert.assertEquals(5, removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));

        Assert.assertEquals(0, removeElement.removeElement(new int[]{}, 2));
    }
}
