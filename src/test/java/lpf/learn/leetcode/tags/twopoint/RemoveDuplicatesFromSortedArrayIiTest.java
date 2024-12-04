package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class RemoveDuplicatesFromSortedArrayIiTest {

    @Test
    public void test1(){
        RemoveDuplicatesFromSortedArrayIi test = new RemoveDuplicatesFromSortedArrayIi();
        Assert.assertEquals(5, test.removeDuplicates(new int[]{1,1,1,2,2,3}));
    }

    @Test
    public void test2(){
        RemoveDuplicatesFromSortedArrayIi test = new RemoveDuplicatesFromSortedArrayIi();
        Assert.assertEquals(7, test.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }

    @Test
    public void test3(){
        RemoveDuplicatesFromSortedArrayIi test = new RemoveDuplicatesFromSortedArrayIi();
        Assert.assertEquals(1, test.removeDuplicates(new int[]{1}));
    }

    @Test
    public void test4(){
        RemoveDuplicatesFromSortedArrayIi test = new RemoveDuplicatesFromSortedArrayIi();
        Assert.assertEquals(2, test.removeDuplicates(new int[]{1, 2}));
    }
}
