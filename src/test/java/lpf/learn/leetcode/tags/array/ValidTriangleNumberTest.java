package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class ValidTriangleNumberTest {

    @Test
    public void test1(){
        ValidTriangleNumber test = new ValidTriangleNumber();
        Assert.assertEquals(3, test.triangleNumber(new int[]{2,2,3,4}));
    }

    @Test
    public void test2(){
        ValidTriangleNumber test = new ValidTriangleNumber();
        Assert.assertEquals(15, test.triangleNumber(new int[]{2,2,3,4,5,9,4}));
    }

    @Test
    public void test3(){
        ValidTriangleNumber test = new ValidTriangleNumber();
        Assert.assertEquals(40, test.triangleNumber(new int[]{2,2,3,4,5,9,4,11,3,13}));
    }

    @Test
    public void test4(){
        ValidTriangleNumber test = new ValidTriangleNumber();
        Assert.assertEquals(116, test.triangleNumber(new int[]{2,2,3,4,5,1,5,7,8,9,4,11,3,13}));
    }

}
