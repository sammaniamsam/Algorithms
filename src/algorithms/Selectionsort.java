/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author samuel
 */
public class Selectionsort {
    
    /**
     * This method is used to organize an array of integers
     * from smallest to largest.
     * Runtime: O(n^2)
     * @param array An unsorted array of integers.
    */
    public void sort(Integer[] array) {
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
}
