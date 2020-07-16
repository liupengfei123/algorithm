package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class SimplifyPathTest {

    @Test
    public void test(){
        SimplifyPath test = new SimplifyPath();

        Assert.assertEquals("/...", test.simplifyPath("/..."));

        Assert.assertEquals("/a/b/c", test.simplifyPath("/a//b////c/d//././/.."));
        Assert.assertEquals("/", test.simplifyPath("/../"));
        Assert.assertEquals("/", test.simplifyPath("/.."));
        Assert.assertEquals("/c", test.simplifyPath("/a/../../b/../c//.//"));
        Assert.assertEquals("/home/foo", test.simplifyPath("/home//foo/"));
        Assert.assertEquals("/home", test.simplifyPath("/home/"));

    }
}
