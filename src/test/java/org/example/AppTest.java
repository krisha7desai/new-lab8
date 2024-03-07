package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest
    extends TestCase
{
    private MyStack<Integer> stack;

    public void setUp() {
        stack = new MyStack<>();
    }

    public void testPush() {
        stack.push(1);
        stack.push(2);
        assertEquals("Second element should be on top", Integer.valueOf(2), stack.peek());
    }

    public void testPop() {
        stack.push(1);
        stack.push(2);
        assertEquals("Pop should return the last element pushed", Integer.valueOf(2), stack.pop());

    }

    public void testIsEmpty() {
        assertTrue("Stack should be empty initially", stack.isEmpty());
        stack.push(1);
        stack.push(1);
        assertFalse("Stack should not be empty after push", stack.isEmpty());
    }

    public void testSize() {
        assertEquals("Initial stack size should be 0", 0, stack.size());
        stack.push(1);
        assertEquals("Stack size should be 1 after pushing one item", 1, stack.size());
        stack.pop();
        assertEquals("Stack size should return to 0 after popping the only item", 0, stack.size());
    }

    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
