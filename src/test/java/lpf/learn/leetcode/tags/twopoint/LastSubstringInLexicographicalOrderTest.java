package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class LastSubstringInLexicographicalOrderTest {
    @Test
    public void test1(){
        LastSubstringInLexicographicalOrder test = new LastSubstringInLexicographicalOrder();
        Assert.assertEquals("bab", test.lastSubstring("abab"));
    }

    @Test
    public void test2(){
        LastSubstringInLexicographicalOrder test = new LastSubstringInLexicographicalOrder();
        Assert.assertEquals("tcode", test.lastSubstring("leetcode"));
    }

    @Test
    public void test3(){
        LastSubstringInLexicographicalOrder test = new LastSubstringInLexicographicalOrder();
        Assert.assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", test.lastSubstring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void test4(){
        LastSubstringInLexicographicalOrder test = new LastSubstringInLexicographicalOrder();
        Assert.assertEquals("zyqbzsndfffadaqzgarnmtraawrqdzdfq", test.lastSubstring("sdfaadgakdjfnalnzpqbwbdlzsbfybzqbfysgfkqbybzsldyfybqwbdzyqbzsndfffadaqzgarnmtraawrqdzdfq"));
    }
    @Test
    public void test5(){
        LastSubstringInLexicographicalOrder test = new LastSubstringInLexicographicalOrder();
        Assert.assertEquals("zygluflzubdlaugluhudfgqweryurutpoiiuufgnbmbchnfjjhxjajfjgjjjjxjxjxjjfgjfsregsjgsffkfkjgsladhfahefalhdfauhdflpalauhfuqqpqqpzvzvvmnvnbnbzjdhghgwfaegafawefaghjkdhkshaergzggqqertsfdgxdfhsghdf",
                test.lastSubstring("dfkajnlzncvzudlfaiudhflaudblaybglzygluflzubdlaugluhudfgqweryurutpoiiuufgnbmbchnfjjhxjajfjgjjjjxjxjxjjfgjfsregsjgsffkfkjgsladhfahefalhdfauhdflpalauhfuqqpqqpzvzvvmnvnbnbzjdhghgwfaegafawefaghjkdhkshaergzggqqertsfdgxdfhsghdf"));
    }

}
