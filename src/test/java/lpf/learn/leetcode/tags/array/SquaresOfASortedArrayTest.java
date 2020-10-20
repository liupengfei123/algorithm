package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class SquaresOfASortedArrayTest {

    @Test
    public void test1(){
        SquaresOfASortedArray test = new SquaresOfASortedArray();
        Assert.assertArrayEquals(new int[]{0,1,9,16,100}, test.sortedSquares(new int[]{-4,-1,0,3,10}));
    }

    @Test
    public void test2(){
        SquaresOfASortedArray test = new SquaresOfASortedArray();
        Assert.assertArrayEquals(new int[]{4,9,9,49,121}, test.sortedSquares(new int[]{-7,-3,2,3,11}));
    }

    @Test
    public void test3(){
        SquaresOfASortedArray test = new SquaresOfASortedArray();
        Assert.assertArrayEquals(new int[]{4,16,25,36,49}, test.sortedSquares(new int[]{-7,-6,-5,-4,-2}));
    }

    @Test
    public void test4(){
        SquaresOfASortedArray test = new SquaresOfASortedArray();
        Assert.assertArrayEquals(new int[]{1,4,9,16,25}, test.sortedSquares(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test5(){
        SquaresOfASortedArray test = new SquaresOfASortedArray();
        Assert.assertArrayEquals(new int[]{1,4,4}, test.sortedSquares(new int[]{-1,2,2}));
    }


}
