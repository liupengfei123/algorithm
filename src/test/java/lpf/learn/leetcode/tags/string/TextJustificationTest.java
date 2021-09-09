package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class TextJustificationTest {

    @Test
    public void test1() {
        TextJustification temp = new TextJustification();
        List<String> list = new ArrayList<>();
        list.add("This    is    an");
        list.add("example  of text");
        list.add("justification.  ");

        Assert.assertEquals(list, temp.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16));
    }

    @Test
    public void test2() {
        TextJustification temp = new TextJustification();
        List<String> list = new ArrayList<>();
        list.add("What   must   be");
        list.add("acknowledgment  ");
        list.add("shall be        ");

        Assert.assertEquals(list, temp.fullJustify(new String[]{"What","must","be","acknowledgment","shall","be"}, 16));
    }

    @Test
    public void test3() {
        TextJustification temp = new TextJustification();
        List<String> list = new ArrayList<>();
        list.add("Science  is  what we");
        list.add("understand      well");
        list.add("enough to explain to");
        list.add("a  computer.  Art is");
        list.add("everything  else  we");
        list.add("do                  ");

        Assert.assertEquals(list, temp.fullJustify(new String[]{"Science","is","what","we","understand","well","enough","to","explain", "to","a","computer.","Art","is","everything","else","we","do"}, 20));
    }
}
