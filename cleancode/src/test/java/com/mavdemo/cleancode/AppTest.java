package com.mavdemo.cleancode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{

		@Test
		/*
		 * Test Cases for Simple Interest
		 */
		public void testSimpleInterest() {
			Calculate c=new Calculate();
			assertEquals(600.0,c.simpleInterest(10000, 3,2));
			assertEquals(562.5,c.simpleInterest(15000, 1.5,2.5));
			assertEquals(3000.0,c.simpleInterest(6000,10,5));
		}
		
		@Test
		/*
		 * Test Cases for Compound Interest
		 */
		public void testCompoundInterest() {
			Calculate c = new Calculate();
			assertEquals(5000.0,c.compoundInterest(5000,0,3));
			//assertEquals(c,c.compoundInterest(55000, 1.25,1.5));
			//assertEquals(c,c.compoundInterest(100000, 1.5,1.25));
			
		}
		
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}