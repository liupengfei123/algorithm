package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class NumberOfLinesToWriteStringTest {

    @Test
    public void test1() {
        NumberOfLinesToWriteString temp = new NumberOfLinesToWriteString();
        Assert.assertArrayEquals(new int[]{3,60}, temp.numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                "abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void test2() {
        NumberOfLinesToWriteString temp = new NumberOfLinesToWriteString();
        Assert.assertArrayEquals(new int[]{2,4}, temp.numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10, 10,10,10},
                "bbbcccdddaaa"));
    }

    @Test
    public void test3() {
        NumberOfLinesToWriteString temp = new NumberOfLinesToWriteString();
        Assert.assertArrayEquals(new int[]{3,65}, temp.numberOfLines(new int[]{2,10,2,9,8,2,2,5,4,10,5,10,10,10,7,6,5,6,4,8,9,4,10,10,10,10},
                "abcdefghijkaaaaagadlmnopsagadfaqgggadagdarstuvwxyz"));
    }

    @Test
    public void test4() {
        NumberOfLinesToWriteString temp = new NumberOfLinesToWriteString();
        Assert.assertArrayEquals(new int[]{6,10}, temp.numberOfLines(new int[]{2,10,2,9,8,2,2,5,4,10,5,10,10,10,7,6,5,6,4,8,9,4,10,10,10,10},
                "abcdefghijkaaaaagadlmnopsagadfaqgggadagdalhlialfahulwlenflbnfalarstuvwxyzddgzzzadz"));
    }


    @Test
    public void test5() {
        NumberOfLinesToWriteString temp = new NumberOfLinesToWriteString();
        Assert.assertArrayEquals(new int[]{1,2}, temp.numberOfLines(new int[]{2,10,2,9,8,2,2,5,4,10,5,10,10,10,7,6,5,6,4,8,9,4,10,10,10,10},
                "a"));
    }
}
