package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class SnapshotArrayTest {
    @Test
    public void test1(){
        SnapshotArray test = new SnapshotArray(1);
        Assert.assertEquals(0, test.snap());
        Assert.assertEquals(1, test.snap());
        test.set(0, 4);
        Assert.assertEquals(2, test.snap());
        Assert.assertEquals(0, test.get(0, 1));
        test.set(0, 12);
        Assert.assertEquals(0, test.get(0, 1));
        Assert.assertEquals(3, test.snap());
        Assert.assertEquals(12, test.get(0, 3));
    }

    @Test
    public void test2(){
        SnapshotArray test = new SnapshotArray(3);
        test.set(0, 5);
        Assert.assertEquals(0, test.snap());
        test.set(0, 6);
        Assert.assertEquals(5, test.get(0, 0));
    }
}
