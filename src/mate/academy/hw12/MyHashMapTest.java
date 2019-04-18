package mate.academy.hw12;

import mate.academy.hw5.MyHashMap;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashMapTest {
    private MyHashMap<String, Integer> testMap;

    @Before
    public void initialization() {
        testMap = new MyHashMap<>();
        testMap.put("Tomato", 2);
    }

    @Test
    public void put() {
        testMap.put("Meat", 5);
        int actual = testMap.get("Meat");
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void get() {
        int actual = testMap.get("Tomato");
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remove() {
        testMap.put("Chocolate", 1);
        int actual = testMap.remove("Chocolate");
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void contains() {
        Assert.assertTrue(testMap.contains("Tomato"));
        Assert.assertFalse(testMap.contains("Milk"));
    }

    @Test
    public void clear() {
        testMap.clear();
        Assert.assertEquals(testMap.size(), 0);
    }

    @Test
    public void size() {
        Assert.assertEquals(testMap.size(), 1);
    }
}