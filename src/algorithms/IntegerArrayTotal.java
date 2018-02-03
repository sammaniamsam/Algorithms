/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author Sam Man
 */
public class IntegerArrayTotal {
    
    /**
     * This method is used to get the total of an integer array
     * @param iA An unsorted array of integers.
     * @return int This returns the total of the integer array.
    */
    public int getTotal(int[] iA) {
        return getTotal(iA, iA.length);
    }
    
    private int getTotal(int[] iA, int size) {
        if(size > 0) {
            return iA[size-1] + getTotal(iA, size - 1);
        } else { return 0; }
    }
    
}
