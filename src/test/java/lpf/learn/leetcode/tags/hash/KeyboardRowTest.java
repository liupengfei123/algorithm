package lpf.learn.leetcode.tags.hash;

import org.junit.Assert;
import org.junit.Test;

public class KeyboardRowTest {
    @Test
    public void test1(){
        KeyboardRow test = new KeyboardRow();
        Assert.assertArrayEquals(new String[]{"Alaska","Dad"}, test.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));
    }

    @Test
    public void test2(){
        KeyboardRow test = new KeyboardRow();
        Assert.assertArrayEquals(new String[]{"asdfghjkl","qwertyuiop","zxcvbnm"}, test.findWords(new String[]{"asdfghjkl","qwertyuiop","zxcvbnm"}));
    }
}
