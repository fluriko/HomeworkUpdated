package mate.academy.hw12;

import mate.academy.hw4.List;
import mate.academy.hw4.MyArrayList;
import mate.academy.hw4.MyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {
    private List<String> testList;

    @Before
    public void initialization() {
        testList = new MyLinkedList<>();
        testList.add("Sheldon");
        testList.add("Amy");
        testList.add("Penny");
    }

    @Test
    public void add() {
        testList.add("Raj");
        String actual = testList.get(3);
        String expected = "Raj";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void addWithIndex() {
        testList.add("Bernadette", 1);
        String actual = testList.get(1);
        String expected = "Bernadette";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void addAllLinked() {
        List<String> anotherList = new MyLinkedList<>();
        anotherList.add("Raj");
        anotherList.add("Bernadette");
        testList.addAll(anotherList);
        String actual = testList.get(3);
        String expected = "Raj";
        Assert.assertEquals(actual, expected);
        actual = testList.get(4);
        expected = "Bernadette";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void addAll() {
        List<String> anotherList = new MyArrayList<>();
        anotherList.add("Raj");
        anotherList.add("Bernadette");
        testList.addAll(anotherList);
        String actual = testList.get(3);
        String expected = "Raj";
        Assert.assertEquals(actual, expected);
        actual = testList.get(4);
        expected = "Bernadette";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void toArray() {
        Object[] actual = testList.toArray();
        Object[] expected = new String[] {"Sheldon", "Amy", "Penny"};
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void set() {
        testList.set("Howard", 1);
        String actual = testList.get(1);
        String expected = "Howard";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void isEmpty() {
        Assert.assertFalse(testList.isEmpty());
        testList = new MyArrayList<>();
        Assert.assertTrue(testList.isEmpty());
    }

    @Test
    public void removeWithIndex() {
        String actual = testList.remove(1);
        String expected = "Amy";
        Assert.assertEquals(actual, expected);
        actual = testList.get(1);
        expected = "Penny";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void removeWithValue() {
        String actual = testList.remove("Amy");
        String expected = "Amy";
        Assert.assertEquals(actual, expected);
        actual = testList.get(1);
        expected = "Penny";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void get() {
        String actual = testList.get(1);
        String expected = "Amy";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void size() {
        int actual = testList.size();
        int expected = 3;
        Assert.assertEquals(actual, expected);
        testList = new MyLinkedList<>();
        actual = testList.size();
        expected = 0;
        Assert.assertEquals(actual, expected);
    }
}