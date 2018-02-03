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
public class SelectionsortTest {
    
    private Selectionsort ss;
    
    public SelectionsortTest() { this.ss = new Selectionsort(); }

    /**
     * Test of sort method, of class Selectionsort.
     */
    @Test
    public void testSort() {
        System.out.println("selectionSort");
        //Positive Array
        Integer[] iArray1 = {6, 1, 2, 5};
        Integer[] equals1 = {1, 2, 5, 6};
        this.ss.sort(iArray1);
        assert(Arrays.equals(iArray1, equals1));
        //Negative Array
        Integer[] iArray2 = {-6, -1, -2, -5};
        Integer[] equals2 = {-6, -5, -2, -1};
        this.ss.sort(iArray2);
        assert(Arrays.equals(iArray2, equals2));
    }
    
}
