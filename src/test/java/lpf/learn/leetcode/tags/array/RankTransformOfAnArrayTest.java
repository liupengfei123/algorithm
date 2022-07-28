package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class RankTransformOfAnArrayTest {

    @Test
    public void test1(){
        RankTransformOfAnArray test = new RankTransformOfAnArray();
        Assert.assertArrayEquals(new int[]{6,5,1,4,2,7,3}, test.arrayRankTransform(new int[]{5,4,0,3,1,6,2}));
    }

    @Test
    public void test3(){
        RankTransformOfAnArray test = new RankTransformOfAnArray();
        Assert.assertArrayEquals(new int[]{4,1,2,3}, test.arrayRankTransform(new int[]{40,10,20,30}));
    }

    @Test
    public void test4(){
        RankTransformOfAnArray test = new RankTransformOfAnArray();
        Assert.assertArrayEquals(new int[]{1,1,1}, test.arrayRankTransform(new int[]{100,100,100}));
    }

    @Test
    public void test5(){
        RankTransformOfAnArray test = new RankTransformOfAnArray();
        Assert.assertArrayEquals(new int[]{5,3,4,2,8,6,7,1,3}, test.arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12}));
    }

    @Test
    public void test6(){
        RankTransformOfAnArray test = new RankTransformOfAnArray();
        Assert.assertArrayEquals(new int[]{}, test.arrayRankTransform(new int[]{}));
    }

}
