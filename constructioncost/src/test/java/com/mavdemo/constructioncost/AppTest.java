  
package com.mavdemo.constructioncost;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public void testCost() {
		CalculateCost cc = new CalculateCost();
		assertEquals(cc,cc.getCost("standard",6,false));
		assertEquals(cc,cc.getCost("highStandard",3,true));
		assertEquals(cc,cc.getCost("aboveStandard",2,true));
		assertEquals(cc,cc.getCost("highStandard",5,false));
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