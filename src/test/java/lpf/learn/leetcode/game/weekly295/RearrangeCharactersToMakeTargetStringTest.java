package lpf.learn.leetcode.game.weekly295;

import org.junit.Assert;
import org.junit.Test;

public class RearrangeCharactersToMakeTargetStringTest {

    @Test
    public void test1(){
        RearrangeCharactersToMakeTargetString test = new RearrangeCharactersToMakeTargetString();
        Assert.assertEquals(2, test.rearrangeCharacters("ilovecodingonleetcode", "code"));
    }


    @Test
    public void test2(){
        RearrangeCharactersToMakeTargetString test = new RearrangeCharactersToMakeTargetString();
        Assert.assertEquals(1, test.rearrangeCharacters("abcba", "abc"));
    }

    @Test
    public void test3(){
        RearrangeCharactersToMakeTargetString test = new RearrangeCharactersToMakeTargetString();
        Assert.assertEquals(0, test.rearrangeCharacters("abcba", "abce"));
    }
}
