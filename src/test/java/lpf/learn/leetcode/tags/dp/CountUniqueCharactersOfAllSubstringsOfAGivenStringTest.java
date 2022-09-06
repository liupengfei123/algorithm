package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class CountUniqueCharactersOfAllSubstringsOfAGivenStringTest {
    @Test
    public void test1(){
        CountUniqueCharactersOfAllSubstringsOfAGivenString test = new CountUniqueCharactersOfAllSubstringsOfAGivenString();
        Assert.assertEquals(6, test.uniqueLetterString("AAC"));
        Assert.assertEquals(10, test.uniqueLetterString("ABC"));
        Assert.assertEquals(16, test.uniqueLetterString("ABCB"));
        Assert.assertEquals(25, test.uniqueLetterString("ABACB"));
    }

    @Test
    public void test2(){
        CountUniqueCharactersOfAllSubstringsOfAGivenString test = new CountUniqueCharactersOfAllSubstringsOfAGivenString();
        Assert.assertEquals(20, test.uniqueLetterString("ABCD"));
        Assert.assertEquals(33, test.uniqueLetterString("ABCDA"));
        Assert.assertEquals(31, test.uniqueLetterString("ABCDB"));
        Assert.assertEquals(29, test.uniqueLetterString("ABCDC"));
        Assert.assertEquals(27, test.uniqueLetterString("ABCDD"));
        Assert.assertEquals(34, test.uniqueLetterString("ABCDDD"));
    }

    @Test
    public void test3(){
        CountUniqueCharactersOfAllSubstringsOfAGivenString test = new CountUniqueCharactersOfAllSubstringsOfAGivenString();
        Assert.assertEquals(48, test.uniqueLetterString("ABCDDDE"));
    }

    @Test
    public void test4(){
        CountUniqueCharactersOfAllSubstringsOfAGivenString test = new CountUniqueCharactersOfAllSubstringsOfAGivenString();
        Assert.assertEquals(1, test.uniqueLetterString("L"));
        Assert.assertEquals(4, test.uniqueLetterString("LE"));
        Assert.assertEquals(6, test.uniqueLetterString("LEE"));
        Assert.assertEquals(12, test.uniqueLetterString("LEET"));
        Assert.assertEquals(23, test.uniqueLetterString("LEETC"));
        Assert.assertEquals(40, test.uniqueLetterString("LEETCO"));
        Assert.assertEquals(64, test.uniqueLetterString("LEETCOD"));
        Assert.assertEquals(92, test.uniqueLetterString("LEETCODE"));
    }
}
