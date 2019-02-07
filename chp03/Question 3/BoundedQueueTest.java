/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.quality;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BoundedQueueTest {
    
    public BoundedQueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of enQueue method, of class BoundedQueue.
     */
    @Test
    public void testEnQueue() {
        System.out.println("enQueue");
        BoundedQueue instance = new BoundedQueue(2);
        instance.enQueue("Hewwo");
        Object expResult = false;
        Object result = instance.isEmpty();
        assertEquals(expResult, result);        
    }

    /**
     * Test of deQueue method, of class BoundedQueue.
     */
    @Test
    public void testDeQueue() {
        System.out.println("deQueue");
        BoundedQueue instance = new BoundedQueue(2);
        instance.enQueue("Hewwo"); 
        Object o = instance.deQueue();
        Object expResult = true;
        Object result = o.equals("Hewwo");
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class BoundedQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BoundedQueue instance = new BoundedQueue(0);
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isFull method, of class BoundedQueue.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        BoundedQueue instance = new BoundedQueue(1);
        instance.enQueue("Hello");
        boolean expResult = true;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class BoundedQueue.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BoundedQueue instance = new BoundedQueue(1);
        instance.enQueue("Hello");
        boolean expResult = true;
        boolean result = String.class.isInstance(instance.toString());
        assertEquals(expResult, result);
    }   
}
