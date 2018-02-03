/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import org.junit.Test;

/**
 *
 * @author samuel
 */
public class EuclidsAlgorithmTest {
    
    private EuclidsAlgorithm ea;
    
    public EuclidsAlgorithmTest() { ea = new EuclidsAlgorithm(); }

    /**
     * Test of divideSpace method, of class EuclidsAlgorithm.
     */
    @Test
    public void testDivideSpace() {
        //Greatest factor of two sides
        org.junit.Assert.assertEquals(80, this.ea.divideSpace(1680, 640));
        //Base case hit first
        org.junit.Assert.assertEquals(35, this.ea.divideSpace(105, 35));
        //Smallest positive whole number
        org.junit.Assert.assertEquals(1, this.ea.divideSpace(113, 4));
    }
    
}
