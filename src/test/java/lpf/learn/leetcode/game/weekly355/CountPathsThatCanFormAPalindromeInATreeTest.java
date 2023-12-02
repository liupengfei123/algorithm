package lpf.learn.leetcode.game.weekly355;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CountPathsThatCanFormAPalindromeInATreeTest {
    @Test
    public void test1(){
        CountPathsThatCanFormAPalindromeInATree test = new CountPathsThatCanFormAPalindromeInATree();
        Assert.assertEquals(8, test.countPalindromePaths(Arrays.asList(-1,0,0,1,1,2), "acaabc"));
    }


    @Test
    public void test2(){
        CountPathsThatCanFormAPalindromeInATree test = new CountPathsThatCanFormAPalindromeInATree();
        Assert.assertEquals(10, test.countPalindromePaths(Arrays.asList(-1,0,0,0,0), "aaaaa"));
    }
}
