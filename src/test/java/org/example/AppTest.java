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
        assertEquals("Stack size should decrease after pop", 1, stack.size());
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
