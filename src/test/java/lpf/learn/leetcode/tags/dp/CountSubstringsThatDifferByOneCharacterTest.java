package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class CountSubstringsThatDifferByOneCharacterTest {
    @Test
    public void test1(){
        CountSubstringsThatDifferByOneCharacter test = new CountSubstringsThatDifferByOneCharacter();
        Assert.assertEquals(6, test.countSubstrings("aba", "baba"));
    }

    @Test
    public void test2(){
        CountSubstringsThatDifferByOneCharacter test = new CountSubstringsThatDifferByOneCharacter();
        Assert.assertEquals(3, test.countSubstrings("ab", "bb"));
    }

    @Test
    public void test3(){
        CountSubstringsThatDifferByOneCharacter test = new CountSubstringsThatDifferByOneCharacter();
        Assert.assertEquals(0, test.countSubstrings("a", "a"));
    }

    @Test
    public void test4(){

    }

    @Test
    public void test5(){

    }

    @Test
    public void test6(){

    }

}
