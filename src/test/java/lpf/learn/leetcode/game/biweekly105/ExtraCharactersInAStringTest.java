package lpf.learn.leetcode.game.biweekly105;

import org.junit.Assert;
import org.junit.Test;

public class ExtraCharactersInAStringTest {
    @Test
    public void test1(){
        ExtraCharactersInAString test = new ExtraCharactersInAString();
        Assert.assertEquals(1, test.minExtraChar("leetscode", new String[]{"leet","code","leetcode"}));
    }

    @Test
    public void test2(){
        ExtraCharactersInAString test = new ExtraCharactersInAString();
        Assert.assertEquals(3, test.minExtraChar("sayhelloworld", new String[]{"hello","world"}));
    }

    @Test
    public void test3(){
        ExtraCharactersInAString test = new ExtraCharactersInAString();
        Assert.assertEquals(7, test.minExtraChar("dwmodizxvvbosxxw", new String[]{"ox","lb","diz","gu","v","ksv","o","nuq","r","txhe","e","wmo","cehy","tskz","ds","kzbu"}));
    }

    @Test
    public void test4(){
        ExtraCharactersInAString test = new ExtraCharactersInAString();
        Assert.assertEquals(5, test.minExtraChar("metzeaencgpgvsckjrqafkxgyzbe", new String[]{"zdzz","lgrhy","r","ohk","zkowk","g","zqpn","anoni","ka","qafkx","t","jr","xdye","mppc","bqqb","encgp","yf","vl","ctsxk","gn","cujh","ce","rwrpq","tze","zxhg","yzbe","c","o","hnk","gv","uzbc","xn","kk","ujjd","vv","mxhmv","ugn","at","kumr","ensv","x","uy","gb","ae","jljuo","xqkgj"}));
    }
}