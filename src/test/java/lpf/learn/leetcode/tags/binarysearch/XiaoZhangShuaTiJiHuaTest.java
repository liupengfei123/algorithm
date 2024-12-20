package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-05-09 18:17
 */
public class XiaoZhangShuaTiJiHuaTest {
    @Test
    public void test1(){
        XiaoZhangShuaTiJiHua test = new XiaoZhangShuaTiJiHua();
        Assert.assertEquals(3, test.minTime(new int[]{1,2,3,3}, 2));
    }

    @Test
    public void test2(){
        XiaoZhangShuaTiJiHua test = new XiaoZhangShuaTiJiHua();
        Assert.assertEquals(3, test.minTime(new int[]{1,2,3,3,3}, 2));
    }

    @Test
    public void test3(){
        XiaoZhangShuaTiJiHua test = new XiaoZhangShuaTiJiHua();
        Assert.assertEquals(11, test.minTime(new int[]{1,41,5,1,25,1,5,7,8,3,6,7,1,8,8,6,5,4,5,6,24,15}, 8));
    }

    @Test
    public void test4(){
        XiaoZhangShuaTiJiHua test = new XiaoZhangShuaTiJiHua();
        Assert.assertEquals(21, test.minTime(new int[]{1,41,5,1,25,1,5,7,8,3,6,7,1,8,8,6,5,4,5,6,24,15}, 5));
    }

    @Test
    public void test5(){
        XiaoZhangShuaTiJiHua test = new XiaoZhangShuaTiJiHua();
        Assert.assertEquals(3, test.minTime(new int[]{1,2,3,3}, 2));
    }


}
