/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sam Man
 */
public class AlgorithmTest {
    
    private Algorithm algorithm;
    
    public AlgorithmTest() { algorithm = new Algorithm(); }

    /**
     * Test of binarySearch method, of class Algorithm.
     */
    @Test
    public void testBinarySearch() {
        System.out.println("binarySearch");
        //Array length is odd
        int[] iArray1 = {1, 2, 3, 4, 5, 6, 7};
        assertBinarySearchWorks(iArray1);
        //Array length is Even
        int[] iArray2 = {1, 2, 3, 4, 5, 6, 7, 8};
        assertBinarySearchWorks(iArray2);
    }
    
    private void assertBinarySearchWorks(int[] iA) {
        assertEquals(algorithm.binarySearch(iA, 2), 1);
        assertEquals(algorithm.binarySearch(iA, 4), 3);
        assertEquals(algorithm.binarySearch(iA, 7), 6);
        assertEquals(algorithm.binarySearch(iA, 10), -1);
        assertEquals(algorithm.binarySearch(iA, 0), -1);
    }
    
}
