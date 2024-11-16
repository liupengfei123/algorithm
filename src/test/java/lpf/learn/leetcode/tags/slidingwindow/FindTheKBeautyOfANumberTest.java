package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class FindTheKBeautyOfANumberTest {

    @Test
    public void test1(){
        FindTheKBeautyOfANumber test = new FindTheKBeautyOfANumber();
        Assert.assertEquals(2, test.divisorSubstrings(240, 2));
    }

    @Test
    public void test2(){
        FindTheKBeautyOfANumber test = new FindTheKBeautyOfANumber();
        Assert.assertEquals(2, test.divisorSubstrings(430043, 2));
    }

    @Test
    public void test3(){
        FindTheKBeautyOfANumber test = new FindTheKBeautyOfANumber();
        Assert.assertEquals(2, test.divisorSubstrings(240, 2));
    }

}
