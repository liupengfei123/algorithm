package lpf.learn.leetcode.tags.tree;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class LexicographicalNumbersTest {


    @Test
    public void test1() {
        LexicographicalNumbers temp = new LexicographicalNumbers();
        Assert.assertEquals(Arrays.asList(1,10,11,12,13,2,3,4,5,6,7,8,9), temp.lexicalOrder(13));
    }

    @Test
    public void test2() {
        LexicographicalNumbers temp = new LexicographicalNumbers();
        Assert.assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9), temp.lexicalOrder(9));
    }

    @Test
    public void test3() {
        LexicographicalNumbers temp = new LexicographicalNumbers();
        Assert.assertEquals(Arrays.asList(1,10,100,101,102,103,104,105,106,107,108,109,11,110,111,112,113,114,115,116,117,118,119,12,120,121,122,123,124,125,126,127,128,129,13,130,131,132,14,15,16,17,18,19,2,20,21,22,23,24,25,26,27,28,29,3,30,31,32,33,34,35,36,37,38,39,4,40,41,42,43,44,45,46,47,48,49,5,50,51,52,53,54,55,56,57,58,59,6,60,61,62,63,64,65,66,67,68,69,7,70,71,72,73,74,75,76,77,78,79,8,80,81,82,83,84,85,86,87,88,89,9,90,91,92,93,94,95,96,97,98,99), temp.lexicalOrder(132));
    }
}
