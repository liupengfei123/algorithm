package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class KDiffPairsInAnArrayTest {

    @Test
    public void test1(){
        KDiffPairsInAnArray test = new KDiffPairsInAnArray();
        Assert.assertEquals(2, test.findPairs(new int[]{3, 1, 4, 1, 5}, 2));
    }

    @Test
    public void test2(){
        KDiffPairsInAnArray test = new KDiffPairsInAnArray();
        Assert.assertEquals(4, test.findPairs(new int[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    public void test3(){
        KDiffPairsInAnArray test = new KDiffPairsInAnArray();
        Assert.assertEquals(1, test.findPairs(new int[]{1, 3, 1, 5, 4}, 0));
    }

    @Test
    public void test4(){
        KDiffPairsInAnArray test = new KDiffPairsInAnArray();
        Assert.assertEquals(1, test.findPairs(new int[]{1, 3, 1, 5, 4, 1}, 0));
    }

    @Test
    public void test5(){
        KDiffPairsInAnArray test = new KDiffPairsInAnArray();
        Assert.assertEquals(2, test.findPairs(new int[]{1, 3, 1, 5, 4, 3}, 0));
    }

    @Test
    public void test6(){
        KDiffPairsInAnArray test = new KDiffPairsInAnArray();
        Assert.assertEquals(0, test.findPairs(new int[]{1, 3, 1, 5, 4, 3}, 50));
    }
}
