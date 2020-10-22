package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class AvailableCapturesForRookTest {

    @Test
    public void test1(){
        AvailableCapturesForRook test = new AvailableCapturesForRook();
        Assert.assertEquals(3, test.numRookCaptures(new char[][]{{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','R','.','.','.','p'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}}));
    }

    @Test
    public void test2(){
        AvailableCapturesForRook test = new AvailableCapturesForRook();
        Assert.assertEquals(0, test.numRookCaptures(new char[][]{{'.','.','.','.','.','.','.','.'},{'.','p','p','p','p','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','B','R','B','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','p','p','p','p','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}}));
    }

    @Test
    public void test3(){
        AvailableCapturesForRook test = new AvailableCapturesForRook();
        Assert.assertEquals(3, test.numRookCaptures(new char[][]{{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'p','p','.','R','.','p','B','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','B','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'}}));
    }

}
