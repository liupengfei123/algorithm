package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class ReverseSubstringsBetweenEachPairOfParenthesesTest {

    @Test
    public void test(){
        ReverseSubstringsBetweenEachPairOfParentheses test = new ReverseSubstringsBetweenEachPairOfParentheses();

        Assert.assertEquals("dcba", test.reverseParentheses("(abcd)"));
        Assert.assertEquals("abcd", test.reverseParentheses("((abcd))"));

        Assert.assertEquals("iloveu", test.reverseParentheses("(u(love)i)"));

        Assert.assertEquals("leetcode", test.reverseParentheses("(ed(et(oc))el)"));

        Assert.assertEquals("apmnolkjihgfedcbq", test.reverseParentheses("a(bcdefghijkl(mno)p)q"));




    }
}
