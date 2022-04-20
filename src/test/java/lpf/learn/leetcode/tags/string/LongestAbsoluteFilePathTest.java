package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class LongestAbsoluteFilePathTest {

    @Test
    public void test1() {
        LongestAbsoluteFilePath temp = new LongestAbsoluteFilePath();
        Assert.assertEquals(20, temp.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
    }

    @Test
    public void test2() {
        LongestAbsoluteFilePath temp = new LongestAbsoluteFilePath();
        Assert.assertEquals(32, temp.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));
    }

    @Test
    public void test3() {
        LongestAbsoluteFilePath temp = new LongestAbsoluteFilePath();
        Assert.assertEquals(0, temp.lengthLongestPath("a"));
    }

    @Test
    public void test4() {
        LongestAbsoluteFilePath temp = new LongestAbsoluteFilePath();
        Assert.assertEquals(0, temp.lengthLongestPath("dir\n\tdir1\n\t\tdir2"));
    }

    @Test
    public void test5() {
        LongestAbsoluteFilePath temp = new LongestAbsoluteFilePath();
        Assert.assertEquals(12, temp.lengthLongestPath("file1.txt\nfile2.txt\nlongfile.txt"));
    }

    @Test
    public void test6() {
        LongestAbsoluteFilePath temp = new LongestAbsoluteFilePath();
        Assert.assertEquals(20, temp.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
    }
}
