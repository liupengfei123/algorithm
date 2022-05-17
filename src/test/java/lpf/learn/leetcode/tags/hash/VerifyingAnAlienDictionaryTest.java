package lpf.learn.leetcode.tags.hash;

import org.junit.Assert;
import org.junit.Test;

public class VerifyingAnAlienDictionaryTest {
    @Test
    public void test1(){
        VerifyingAnAlienDictionary test = new VerifyingAnAlienDictionary();

        Assert.assertTrue(test.isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
    }

    @Test
    public void test2(){
        VerifyingAnAlienDictionary test = new VerifyingAnAlienDictionary();

        Assert.assertFalse(test.isAlienSorted(new String[]{"word","world","row"}, "worldabcefghijkmnpqstuvxyz"));
    }

    @Test
    public void test3(){
        VerifyingAnAlienDictionary test = new VerifyingAnAlienDictionary();

        Assert.assertFalse(test.isAlienSorted(new String[]{"apple","app"}, "abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void test4(){
        VerifyingAnAlienDictionary test = new VerifyingAnAlienDictionary();

        Assert.assertFalse(test.isAlienSorted(new String[]{"zirqhpfscx","zrmvtxgelh","vokopzrtc","nugfyso","rzdmvyf","vhvqzkfqis","dvbkppw","ttfwryy","dodpbbkp","akycwwcdog"},
                "khjzlicrmunogwbpqdetasyfvx"));
    }
}