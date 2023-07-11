package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class MaximumAlternatingSubsequenceSumTest {

    @Test
    public void test1(){
        MaximumAlternatingSubsequenceSum test = new MaximumAlternatingSubsequenceSum();
        Assert.assertEquals(14, test.maxAlternatingSum(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void test2(){
        MaximumAlternatingSubsequenceSum test = new MaximumAlternatingSubsequenceSum();
        Assert.assertEquals(7, test.maxAlternatingSum(new int[]{4,2,5,3}));
    }

    @Test
    public void test3(){
        MaximumAlternatingSubsequenceSum test = new MaximumAlternatingSubsequenceSum();
        Assert.assertEquals(8, test.maxAlternatingSum(new int[]{5,6,7,8}));
    }

    @Test
    public void test4(){
        MaximumAlternatingSubsequenceSum test = new MaximumAlternatingSubsequenceSum();
        Assert.assertEquals(10, test.maxAlternatingSum(new int[]{6,2,1,2,4,5}));
    }

}
