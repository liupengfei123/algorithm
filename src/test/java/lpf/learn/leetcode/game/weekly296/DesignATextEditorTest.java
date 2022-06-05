package lpf.learn.leetcode.game.weekly296;

import org.junit.Assert;
import org.junit.Test;

public class DesignATextEditorTest {
    @Test
    public void test1(){
        DesignATextEditor test = new DesignATextEditor();

        test.addText("leetcode");

        Assert.assertEquals(4,  test.deleteText(4));

        test.addText("practice");

        Assert.assertEquals("etpractice",  test.cursorRight(3));

        Assert.assertEquals("leet",  test.cursorLeft(8));

        Assert.assertEquals(4,  test.deleteText(10));

        Assert.assertEquals("",  test.cursorLeft(2));

        Assert.assertEquals("practi",  test.cursorRight(6));
    }


    @Test
    public void test2(){
        DesignATextEditor test = new DesignATextEditor();

        test.addText("leetcode");
        Assert.assertEquals("leetcod",  test.cursorLeft(1));

        Assert.assertEquals(4,  test.deleteText(4));

        test.addText("practice");

        Assert.assertEquals("epracticee",  test.cursorRight(3));

        Assert.assertEquals(10,  test.deleteText(10));

        Assert.assertEquals("",  test.cursorLeft(2));

        Assert.assertEquals("le",  test.cursorRight(6));
    }

    @Test
    public void test3(){
        DesignATextEditor test = new DesignATextEditor();

        test.addText("bxyackuncqzcqo");

        Assert.assertEquals("bx",  test.cursorLeft(12));

        Assert.assertEquals(2,  test.deleteText(3));

        Assert.assertEquals("",  test.cursorLeft(5));

        test.addText("osdhyvqxf");

        Assert.assertEquals("yackuncqzc",  test.cursorRight(10));

    }
}
