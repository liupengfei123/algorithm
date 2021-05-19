package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestSufficientTeamTest {
    @Test
    public void test1(){
        SmallestSufficientTeam test = new SmallestSufficientTeam();

        List<List<String>> peoples = new ArrayList<>();
        peoples.add(Collections.singletonList("java"));
        peoples.add(Collections.singletonList("nodejs"));
        peoples.add(Arrays.asList("nodejs","reactjs"));

        Assert.assertArrayEquals(new int[]{0, 2}, test.smallestSufficientTeam(new String[]{"java","nodejs","reactjs"}, peoples));
    }

    @Test
    public void test2(){
        SmallestSufficientTeam test = new SmallestSufficientTeam();
        List<List<String>> peoples = new ArrayList<>();
        peoples.add(Arrays.asList("algorithms","math","java"));
        peoples.add(Arrays.asList("algorithms","math","reactjs"));
        peoples.add(Arrays.asList("java","csharp","aws"));
        peoples.add(Arrays.asList("reactjs","csharp"));
        peoples.add(Arrays.asList("csharp","math"));
        peoples.add(Arrays.asList("aws","java"));

        Assert.assertArrayEquals(new int[]{1, 2}, test.smallestSufficientTeam(new String[]{"algorithms","math","java","reactjs","csharp","aws"}, peoples));
    }
}
