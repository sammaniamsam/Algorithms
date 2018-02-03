/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import org.junit.Test;

/**
 *
 * @author Sam Man
 */
public class IntegerArrayTotalTest {
    
    private IntegerArrayTotal iAT;
    
    public IntegerArrayTotalTest() { iAT = new IntegerArrayTotal(); }

    /**
     * Test of getTotal method, of class IntegerArrayTotal.
     */
    @Test
    public void testGetTotal() {
        int[] iA = { 1, 0, 5, 2, 3 };
        assert(this.iAT.getTotal(iA) == 11);
    }
    
}
