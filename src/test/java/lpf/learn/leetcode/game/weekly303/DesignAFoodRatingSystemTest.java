package lpf.learn.leetcode.game.weekly303;

import org.junit.Assert;
import org.junit.Test;

public class DesignAFoodRatingSystemTest {

    @Test
    public void test1(){
        DesignAFoodRatingSystem foodRatings = new DesignAFoodRatingSystem(
                new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"},
                new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"},
                new int[]{9, 12, 8, 15, 14, 7});
        Assert.assertEquals("kimchi", foodRatings.highestRated("korean"));
        Assert.assertEquals("ramen", foodRatings.highestRated("japanese"));

        foodRatings.changeRating("sushi", 16);

        Assert.assertEquals("sushi", foodRatings.highestRated("japanese"));
        foodRatings.changeRating("ramen", 16);

        Assert.assertEquals("ramen", foodRatings.highestRated("japanese"));
    }
}
