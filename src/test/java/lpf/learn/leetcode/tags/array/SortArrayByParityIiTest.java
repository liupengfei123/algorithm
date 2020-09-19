package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class SortArrayByParityIiTest {

    @Test
    public void test1(){
        SortArrayByParityIi test = new SortArrayByParityIi();
        Assert.assertArrayEquals(new int[]{4,5,2,7}, test.sortArrayByParityII(new int[]{4,2,5,7}));
    }
}
