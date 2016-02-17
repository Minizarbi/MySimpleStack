package dcll.alag.mysimplestack;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

/**
 * Created by Alexandre Lagane on 2/10/16.
 */
public class MySimpleStackTest {
    @Test
    public void testPushAndPopAndIsEmpty() {
        MySimpleStack ss = new MySimpleStack();
        assertTrue("testIsEmpty 1", ss.isEmpty());
        ss.push(null);
        assertFalse("testIsEmpty 2", ss.isEmpty());
        ss.pop();
        assertTrue("testIsEmpty 3", ss.isEmpty());
    }

    @Test
    public void testPushAndGetSize() {
        MySimpleStack ss = new MySimpleStack();
        assertEquals("testGetSize 1", 0, ss.getSize());
        ss.push(null);
        ss.push(null);
        assertEquals("testGetSize 2", 2, ss.getSize());
    }

    @Test
    public void testPushAndPeek() {
        MySimpleStack ss = new MySimpleStack();
        Item i = new Item();
        ss.push(i);
        Item o = ss.peek();
        assertSame(i, o);
    }

    @Test
    public void testPushAndPop() {
        MySimpleStack ss = new MySimpleStack();
        Item i = new Item();
        ss.push(i);
        Item o = ss.pop();
        assertSame(i, o);
    }

    @Test(expected = EmptyStackException.class)
    public void testExceptionPop() throws EmptyStackException {
        MySimpleStack ss = new MySimpleStack();
        ss.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void testExceptionPeek() throws EmptyStackException {
        MySimpleStack ss = new MySimpleStack();
        ss.peek();
    }
}