package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class AsteroidCollisionTest {

    @Test
    public void test1(){
        AsteroidCollision test = new AsteroidCollision();

        Assert.assertArrayEquals(new int[]{5,10}, test.asteroidCollision(new int[]{5,10,-5}));
    }

    @Test
    public void test2(){
        AsteroidCollision test = new AsteroidCollision();

        Assert.assertArrayEquals(new int[]{}, test.asteroidCollision(new int[]{8, -8}));
    }

    @Test
    public void test3(){
        AsteroidCollision test = new AsteroidCollision();

        Assert.assertArrayEquals(new int[]{10}, test.asteroidCollision(new int[]{10,2,-5}));
    }

    @Test
    public void test4(){
        AsteroidCollision test = new AsteroidCollision();

        Assert.assertArrayEquals(new int[]{-2,-1,2,1}, test.asteroidCollision(new int[]{-2,-1,2,1}));
    }

    @Test
    public void test5(){
        AsteroidCollision test = new AsteroidCollision();

        Assert.assertArrayEquals(new int[]{-2,-2,-2}, test.asteroidCollision(new int[]{-2,-2,1,-2}));
    }
}
