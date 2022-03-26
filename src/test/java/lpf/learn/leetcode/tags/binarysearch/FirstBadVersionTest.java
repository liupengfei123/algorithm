package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 */
public class FirstBadVersionTest {
    @Test
    public void test1(){
        FirstBadVersion test = new FirstBadVersion(3);
        Assert.assertEquals(3, test.firstBadVersion(5));
    }

    @Test
    public void test2(){
        FirstBadVersion test = new FirstBadVersion(1);
        Assert.assertEquals(1, test.firstBadVersion(1));
    }

    @Test
    public void test3(){
        FirstBadVersion test = new FirstBadVersion(1);
        Assert.assertEquals(1, test.firstBadVersion(2));
    }

    @Test
    public void test4(){
        FirstBadVersion test = new FirstBadVersion(6);
        Assert.assertEquals(6, test.firstBadVersion(10));
    }

    @Test
    public void test5(){
        FirstBadVersion test = new FirstBadVersion(13);
        Assert.assertEquals(13, test.firstBadVersion(100));
    }

    @Test
    public void test6(){
        FirstBadVersion test = new FirstBadVersion(12411423);
        Assert.assertEquals(12411423, test.firstBadVersion(1000000000));
    }

    @Test
    public void test7(){
        FirstBadVersion test = new FirstBadVersion(1);
        Assert.assertEquals(1, test.firstBadVersion(1000000000));
    }

    @Test
    public void test8(){
        FirstBadVersion test = new FirstBadVersion(1000000000);
        Assert.assertEquals(1000000000, test.firstBadVersion(1000000000));
    }
}
