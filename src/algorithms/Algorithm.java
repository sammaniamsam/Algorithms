/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * <h1>Algorithms in Java</h1>
 * @author Sam Man
 */
public class Algorithm {
    
    /**
     * This method is used to find the position of an
     * integer that is located within an unsorted integer
     * array.
     * @param array An unsorted array of integers.
     * @param item Integer that will be located.
     * @return int This returns the position for item or -1
     * if item is not found.
    */
    public int binarySearch(int[] array, int item) {
        Arrays.sort(array);
        int start = 0;
        int end = array.length - 1;
        return binarySearch(array, item, start, end);
    }
    
    private int binarySearch(int[] iA, int i, int start, int end) {
        if(start > end) { return -1; }
        else {
            int mid = (start + end) / 2;
            if(iA[mid] == i) { return mid; }
            if(iA[mid] > i) { end = mid - 1; }
            else { start = mid + 1; }
            return binarySearch(iA, i, start, end);
        }
    }
    
    public int getTotal(int[] iA) {
        return getTotal(iA, iA.length);
    }
    
    private int getTotal(int[] iA, int size) {
        if(size > 0) {
            return iA[size-1] + getTotal(iA, size - 1);
        } else { return 0; }
    }
    
}
