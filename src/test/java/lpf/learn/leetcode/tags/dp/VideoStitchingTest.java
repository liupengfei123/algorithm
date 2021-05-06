package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class VideoStitchingTest {
    @Test
    public void test1(){
        VideoStitching test = new VideoStitching();
        Assert.assertEquals(3, test.videoStitching(new int[][]{{0,2},{4,6},{8,10},{1,9},{1,5},{5,9}}, 10));
    }

    @Test
    public void test2(){
        VideoStitching test = new VideoStitching();
        Assert.assertEquals(-1, test.videoStitching(new int[][]{{0,1},{1,2}}, 5));
    }

    @Test
    public void test3(){
        VideoStitching test = new VideoStitching();
        Assert.assertEquals(2, test.videoStitching(new int[][]{{0,4},{2,8}}, 5));
    }

    @Test
    public void test4(){
        VideoStitching test = new VideoStitching();
        Assert.assertEquals(3, test.videoStitching(new int[][]{{0,1},{6,8},{0,2},{5,6},{0,4},{0,3},{6,7},{1,3},{4,7},{1,4},{2,5},{2,6},{3,4},{4,5},{5,7},{6,9}}, 9));
    }


    @Test
    public void test5(){
        VideoStitching test = new VideoStitching();
        Assert.assertEquals(-1, test.videoStitching(new int[][]{{0,2},{4,8}}, 5));
    }

    @Test
    public void test6(){
        VideoStitching test = new VideoStitching();
        Assert.assertEquals(0, test.videoStitching(new int[][]{{2,4}}, 0));
    }


}
