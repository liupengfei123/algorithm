package lpf.learn.leetcode.learn.hash;


import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateTest {

    @Test
    public void test1(){
        ContainsDuplicate test = new ContainsDuplicate();
        Assert.assertFalse(test.containsDuplicate2(new int[]{1, 4, 3, 2}));
    }
    @Test
    public void test2(){
        ContainsDuplicate test = new ContainsDuplicate();
        Assert.assertFalse(test.containsDuplicate2(new int[]{4, 100, 2, 99, 3, 99}));
    }
}
