package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-05-09 18:17
 */
public class BinarySearchTest {
    @Test
    public void test1(){
        BinarySearch test = new BinarySearch();
        Assert.assertEquals(4, test.search(new int[]{-1,0,3,5,9,12}, 9));
    }

    @Test
    public void test2(){
        BinarySearch test = new BinarySearch();
        Assert.assertEquals(-1, test.search(new int[]{-1,0,3,5,9,12}, 2));
    }

    @Test
    public void test3(){
        BinarySearch test = new BinarySearch();
        Assert.assertEquals(5, test.search(new int[]{-1,0,3,5,9,12}, 12));
    }

    @Test
    public void test4(){
        BinarySearch test = new BinarySearch();
        Assert.assertEquals(0, test.search(new int[]{-1,0,3,5,9,12}, -1));
    }
}
