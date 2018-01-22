/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
    
    /**
     * This method is used to organize an array of integers
     * from smallest to largest.
     * @param array An unsorted array of integers.
    */
    public void selectionSort(Integer[] array) {
        Map<Integer, Integer> hm = new HashMap();
        for(int i: array) { hm.put(i, i); }
        for(int i = 0; array.length > i; i++) {
            array[i] = findSmallest(hm);
        }
    }
    
    private int findSmallest(Map<Integer, Integer> m) {
        int min = m.values().stream().findFirst().get();
        for (Integer val : m.values()) { min = min > val ? val : min; }
        m.remove(min);
        return min;
    }
    
    /**
     * This method divides a space, that has sides a
     * and b, evenly into the biggest square plots that
     * can be formed.
     * @param a Side of space
     * @param b Side of space
     * @return int Side of biggest square that the space can
     * be evenly divided into.
    */
    public int euclidsAlgorithm(int a, int b) {
        if((a % b == 0) || (b % a == 0)) {
            int rVal = b > a ? a : b;
            return rVal;
        } else {
            if(a > b) { return euclidsAlgorithm(a - b, b); }
            else { return euclidsAlgorithm(a, b - a); }
        }
    }
    
}
