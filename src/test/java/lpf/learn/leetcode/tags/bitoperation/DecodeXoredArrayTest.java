package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

public class DecodeXoredArrayTest {

    @Test
    public void test1(){
        DecodeXoredArray test = new DecodeXoredArray();
        Assert.assertArrayEquals(new int[]{1,0,2,1}, test.decode(new int[]{1,2,3}, 1));
    }


    @Test
    public void test2(){
        DecodeXoredArray test = new DecodeXoredArray();
        Assert.assertArrayEquals(new int[]{4,2,0,7,4}, test.decode(new int[]{6,2,7,3}, 4));
    }
}
