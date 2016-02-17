package dcll.alag.mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alexandre Lagane on 2/10/16.
 */
public class SimpleStackTest {
    @Test
    public void testPushAndPopAndIsEmpty() throws Exception {
        MySimpleStack ss = new MySimpleStack();
        assertTrue("testIsEmpty 1", ss.isEmpty());
        ss.push(null);
        assertFalse("testIsEmpty 2", ss.isEmpty());
        ss.pop();
        assertTrue("testIsEmpty 3", ss.isEmpty());
    }

    @Test
    public void testPushAndGetSize() throws Exception {
        MySimpleStack ss = new MySimpleStack();
        assertEquals("testGetSize 1", 0, ss.getSize());
        ss.push(null);
        ss.push(null);
        assertEquals("testGetSize 2", 2, ss.getSize());
    }

    @Test
    public void testPushAndPeek() throws Exception {
        MySimpleStack ss = new MySimpleStack();
        Item i = new Item();
        ss.push(i);
        Item o = ss.peek();
        assertSame(i, o);
    }

    @Test
    public void testPushAndPop() throws Exception {
        MySimpleStack ss = new MySimpleStack();
        Item i = new Item();
        ss.push(i);
        Item o = ss.pop();
        assertSame(i, o);
    }

    @Test
    public void testExceptionPop() throws Exception {
        MySimpleStack ss = new MySimpleStack();
        Throwable e = null;

        try {
            ss.pop();
        } catch (Throwable ex) {
            e = ex;
        }

        assertTrue(e instanceof EmptyStackException);
    }

    @Test
    public void testExceptionPeek() throws Exception {
        MySimpleStack ss = new MySimpleStack();
        Throwable e = null;

        try {
            ss.peek();
        } catch (Throwable ex) {
            e = ex;
        }

        assertTrue(e instanceof EmptyStackException);
    }
}