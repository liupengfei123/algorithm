package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class BinaryStringWithSubstringsRepresenting1ToNTest {

    @Test
    public void test1() {
        BinaryStringWithSubstringsRepresenting1ToN temp = new BinaryStringWithSubstringsRepresenting1ToN();
        Assert.assertTrue(temp.queryString("1", 1));
    }

    @Test
    public void test2() {
        BinaryStringWithSubstringsRepresenting1ToN temp = new BinaryStringWithSubstringsRepresenting1ToN();
        Assert.assertTrue(temp.queryString("0110", 3));
    }

    @Test
    public void test3() {
        BinaryStringWithSubstringsRepresenting1ToN temp = new BinaryStringWithSubstringsRepresenting1ToN();
        Assert.assertFalse(temp.queryString("0110", 4));
    }

    @Test
    public void test4() {
        BinaryStringWithSubstringsRepresenting1ToN temp = new BinaryStringWithSubstringsRepresenting1ToN();
        Assert.assertFalse(temp.queryString("01101010101010101010001001101111111111110011001101010010010101111001001010101", 29997221));
    }

    @Test
    public void test5() {
        BinaryStringWithSubstringsRepresenting1ToN temp = new BinaryStringWithSubstringsRepresenting1ToN();
        Assert.assertFalse(temp.queryString("1001111100100000101101110011101011100001111111110110111100101001111101100011100101000001000110101010", 50));
    }
}
