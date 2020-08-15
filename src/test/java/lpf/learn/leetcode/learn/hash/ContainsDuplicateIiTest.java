package lpf.learn.leetcode.learn.hash;


import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateIiTest {

    @Test
    public void test1(){
        ContainsDuplicateIi test = new ContainsDuplicateIi();
        Assert.assertTrue(test.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }
    @Test
    public void test2(){
        ContainsDuplicateIi test = new ContainsDuplicateIi();

        Assert.assertTrue(test.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }
    @Test
    public void test3(){
        ContainsDuplicateIi test = new ContainsDuplicateIi();
        Assert.assertFalse(test.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}
