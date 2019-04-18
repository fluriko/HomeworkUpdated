package mate.academy.hw12;

import mate.academy.hw4.List;
import mate.academy.hw4.MyArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {
    private List<String> testList;

    @Before
    public void initialization() {
        testList = new MyArrayList<>();
        testList.add("Artemis");
        testList.add("Freya");
    }

    @Test
    public void add() {
        testList.add("Kali");
        String actual = testList.get(2);
        String expected = "Kali";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void addWithIndex() {
        testList.add("Sol", 1);
        String actual = testList.get(1);
        String expected = "Sol";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void addAll() {
        List<String> anotherList = new MyArrayList<>();
        anotherList.add("Kali");
        anotherList.add("Sol");
        testList.addAll(anotherList);
        String actual = testList.get(2);
        String expected = "Kali";
        Assert.assertEquals(actual, expected);
        actual = testList.get(3);
        expected = "Sol";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void toArray() {
        Object[] actual = testList.toArray();
        Object[] expected = new String[] {"Artemis", "Freya"};
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void get() {
        String actual = testList.get(0);
        String expected = "Artemis";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void set() {
        testList.set("Pele", 1);
        String actual = testList.get(1);
        String expected = "Pele";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void removeWithIndex() {
        String actual = testList.remove(0);
        String expected = "Artemis";
        Assert.assertEquals(actual, expected);
        actual = testList.get(0);
        expected = "Freya";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void removeWithValue() {
        String actual = testList.remove("Artemis");
        String expected = "Artemis";
        Assert.assertEquals(actual, expected);
        actual = testList.get(0);
        expected = "Freya";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void size() {
        int actual = testList.size();
        int expected = 2;
        Assert.assertEquals(actual, expected);
        testList = new MyArrayList<>();
        actual = testList.size();
        expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void isEmpty() {
        Assert.assertFalse(testList.isEmpty());
        testList = new MyArrayList<>();
        Assert.assertTrue(testList.isEmpty());
    }
}