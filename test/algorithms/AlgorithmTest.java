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
    
    /**
     * Test of selectionSort method, of class Algorithm.
     */
    @Test
    public void testSelectionSort() {
        System.out.println("selectionSort");
        //Positive Array
        Integer[] iArray1 = {6, 1, 2, 5};
        Integer[] equals1 = {1, 2, 5, 6};
        algorithm.selectionSort(iArray1);
        assert(Arrays.equals(iArray1, equals1));
        //Negative Array
        Integer[] iArray2 = {-6, -1, -2, -5};
        Integer[] equals2 = {-6, -5, -2, -1};
        algorithm.selectionSort(iArray2);
        assert(Arrays.equals(iArray2, equals2));
    }
    
    /**
     * Test of euclidsAlgorithm method, of class Algorithm.
     */
    @Test
    public void testEuclidsAlgorithm() {
        //Greatest factor of two sides
        org.junit.Assert.assertEquals(80, algorithm.euclidsAlgorithm(1680, 640));
        //Base case hit first
        org.junit.Assert.assertEquals(35, algorithm.euclidsAlgorithm(105, 35));
        //Smallest positive whole number
        org.junit.Assert.assertEquals(1, algorithm.euclidsAlgorithm(113, 4));
    }
    
    /**
     * Test of quicksort method, of class Algorithm.
     */
    @Test
    public void testQuickSort() {
        //Array length is odd
        int[] array1 = {5, 2, 3, 1, 7};
        int[] equals1 = {1, 2, 3, 5, 7};
        algorithm.quicksort(array1);
        assert(Arrays.equals(array1, equals1));
        System.out.println("\n\n");
        //Array length is even
        int[] array2 = {3, 5, 1, 2, 7, 6};
        int[] equals2 = {1, 2, 3, 5, 6, 7};
        algorithm.quicksort(array2);
        assert(Arrays.equals(array2, equals2));
        //Arra has duplicates
        int[] array3 = {1, 2, 0, 1, 3, 8, 5, 3, 7, 0};
        int[] equals3 = {0, 0, 1, 1, 2, 3, 3, 5, 7, 8};
        algorithm.quicksort(array3);
        assert(Arrays.equals(array3, equals3));
    }
    
}
