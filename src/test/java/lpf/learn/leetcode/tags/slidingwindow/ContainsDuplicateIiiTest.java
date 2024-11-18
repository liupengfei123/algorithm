package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateIiiTest {
    @Test
    public void test1() {
        ContainsDuplicateIii test = new ContainsDuplicateIii();
        Assert.assertTrue(test.containsNearbyAlmostDuplicate(new int[]{1,2,3,1}, 3, 0));
    }

    @Test
    public void test2() {
        ContainsDuplicateIii test = new ContainsDuplicateIii();
        Assert.assertFalse(test.containsNearbyAlmostDuplicate(new int[]{1,5,9,1,5,9}, 2, 3));
    }

    @Test
    public void test3() {
        ContainsDuplicateIii test = new ContainsDuplicateIii();
        Assert.assertFalse(test.containsNearbyAlmostDuplicate(new int[]{1,5,9,1,5,9}, 2, 3));
    }

    @Test
    public void test4() {
        ContainsDuplicateIii test = new ContainsDuplicateIii();
        Assert.assertFalse(test.containsNearbyAlmostDuplicate(new int[]{1,5,9,1,5,9}, 2, 3));
    }
}
