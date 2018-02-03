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
public class BinarySearchTest {
    
    private BinarySearch bs;
    
    public BinarySearchTest() { bs = new BinarySearch(); }

    /**
     * Test of binarySearch method, of class BinarySearch.
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
        org.junit.Assert.assertEquals(1, this.bs.search(iA, 2));
        org.junit.Assert.assertEquals(1, this.bs.search(iA, 2));
        org.junit.Assert.assertEquals(3, this.bs.search(iA, 4));
        org.junit.Assert.assertEquals(6, this.bs.search(iA, 7));
        org.junit.Assert.assertEquals(-1, this.bs.search(iA, 10));
        org.junit.Assert.assertEquals(-1, this.bs.search(iA, 0));
    }
    
}
