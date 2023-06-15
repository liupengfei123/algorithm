package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class CanMakePalindromeFromSubstringTest {

    @Test
    public void test1(){
        CanMakePalindromeFromSubstring test = new CanMakePalindromeFromSubstring();
        Assert.assertEquals(Arrays.asList(true,false,false,true,true)
                , test.canMakePaliQueries("abcda", new int[][]{{3,3,0},{1,2,0},{0,3,1},{0,3,2},{0,4,1}}));
    }

    @Test
    public void test2(){
        ArrayNesting test = new ArrayNesting();
        Assert.assertEquals(1, test.arrayNesting(new int[]{0,1,2,3,4,5,6}));
    }
}
