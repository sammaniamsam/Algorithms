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
 * @author samuel
 */
public class QuicksortTest {
    
    private Quicksort qs;
    
    public QuicksortTest() { this.qs = new Quicksort(); }

    /**
     * Test of sort method, of class Quicksort.
     */
    @Test
    public void testSort() {
        //Array length is odd
        int[] array1 = {5, 2, 3, 1, 7};
        int[] equals1 = {1, 2, 3, 5, 7};
        this.qs.sort(array1);
        assert(Arrays.equals(array1, equals1));
        //Array length is even
        int[] array2 = {3, 5, 1, 2, 7, 6};
        int[] equals2 = {1, 2, 3, 5, 6, 7};
        this.qs.sort(array2);
        assert(Arrays.equals(array2, equals2));
        //Arra has duplicates
        int[] array3 = {1, 2, 0, 1, 3, 8, 5, 3, 7, 0};
        int[] equals3 = {0, 0, 1, 1, 2, 3, 3, 5, 7, 8};
        this.qs.sort(array3);
        assert(Arrays.equals(array3, equals3));
    }
    
}
