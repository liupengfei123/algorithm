package lpf.learn.leetcode.learn.hash;


import org.junit.Assert;
import org.junit.Test;

public class FirstUniqueCharacterInAStringTest {

    @Test
    public void test1(){
        FirstUniqueCharacterInAString test = new FirstUniqueCharacterInAString();
        Assert.assertEquals(0, test.firstUniqChar("leetcode"));
    }

    @Test
    public void test2(){
        FirstUniqueCharacterInAString test = new FirstUniqueCharacterInAString();
        Assert.assertEquals(2, test.firstUniqChar("loveleetcode"));
    }

    @Test
    public void test3(){
        FirstUniqueCharacterInAString test = new FirstUniqueCharacterInAString();
        Assert.assertEquals(6, test.firstUniqChar("loeleetcode"));
    }

    @Test
    public void test4(){
        FirstUniqueCharacterInAString test = new FirstUniqueCharacterInAString();
        Assert.assertEquals(-1, test.firstUniqChar("loeleeoe"));
    }
}
