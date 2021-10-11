package lpf.learn.leetcode.tags.number;

import org.junit.Assert;
import org.junit.Test;

public class IntegerToEnglishWordsTest {
    @Test
    public void test1(){
        IntegerToEnglishWords test = new IntegerToEnglishWords();
        Assert.assertEquals("One Hundred Twenty Three", test.numberToWords(123));
    }

    @Test
    public void test2(){
        IntegerToEnglishWords test = new IntegerToEnglishWords();
        Assert.assertEquals("Twelve Thousand Three Hundred Forty Five", test.numberToWords(12345));
    }

    @Test
    public void test3(){
        IntegerToEnglishWords test = new IntegerToEnglishWords();
        Assert.assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", test.numberToWords(1234567));
    }


    @Test
    public void test4(){
        IntegerToEnglishWords test = new IntegerToEnglishWords();
        Assert.assertEquals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One", test.numberToWords(1234567891));
    }

    @Test
    public void test5(){
        IntegerToEnglishWords test = new IntegerToEnglishWords();
        Assert.assertEquals("Two Billion One Hundred Forty Seven Million Four Hundred Eighty Three Thousand Six Hundred Forty Seven", test.numberToWords(2147483647));
    }

    @Test
    public void test6(){
        IntegerToEnglishWords test = new IntegerToEnglishWords();
        Assert.assertEquals("One Million", test.numberToWords(1000000));
    }
}
