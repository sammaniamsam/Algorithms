/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Arrays;
import org.junit.Test;

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
        org.junit.Assert.assertEquals(1, algorithm.binarySearch(iA, 2));
        org.junit.Assert.assertEquals(1, algorithm.binarySearch(iA, 2));
        org.junit.Assert.assertEquals(3, algorithm.binarySearch(iA, 4));
        org.junit.Assert.assertEquals(6, algorithm.binarySearch(iA, 7));
        org.junit.Assert.assertEquals(-1, algorithm.binarySearch(iA, 10));
        org.junit.Assert.assertEquals(-1, algorithm.binarySearch(iA, 0));
    }
    
}
