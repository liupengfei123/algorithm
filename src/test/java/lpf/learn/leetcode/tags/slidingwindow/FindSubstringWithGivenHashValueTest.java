package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class FindSubstringWithGivenHashValueTest {
    @Test
    public void test1() {
        FindSubstringWithGivenHashValue test = new FindSubstringWithGivenHashValue();
        Assert.assertEquals("ee", test.subStrHash("leetcode", 7,20,2, 0));
    }

    @Test
    public void test2() {
        FindSubstringWithGivenHashValue test = new FindSubstringWithGivenHashValue();
        Assert.assertEquals("fbx", test.subStrHash("fbxzaad", 31,100,3, 32));
    }

    @Test
    public void test3() {
        FindSubstringWithGivenHashValue test = new FindSubstringWithGivenHashValue();
        Assert.assertEquals("xmmhdakfursinye", test.subStrHash("xmmhdakfursinye", 96,45,15, 21));
    }

    @Test
    public void test4() {
        FindSubstringWithGivenHashValue test = new FindSubstringWithGivenHashValue();
        Assert.assertEquals("rlzblp", test.subStrHash("rlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblprlzblpbfleezoimfzxwnk",
                842163460,815354026,6, 472331242));
    }
}
