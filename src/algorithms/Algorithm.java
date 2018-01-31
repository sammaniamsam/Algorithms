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
    
    
    public int getTotal(int[] iA) {
        return getTotal(iA, iA.length);
    }
    
    private int getTotal(int[] iA, int size) {
        if(size > 0) {
            return iA[size-1] + getTotal(iA, size - 1);
        } else { return 0; }
    }
    
    /**
     * This method takes an unsorted array of integers and
     * sorts that array using quicksort.
     * Average Case: O(nlogn)
     * Worst Case: O(n^2)
     * @param iA Unsorted array of integers
    */
    public void quicksort(int[] iA) {
        quicksort(iA, 0, iA.length);
    }
    
    private void quicksort(int[] iA, int head, int tail) {
<<<<<<< HEAD
        //base case
=======
>>>>>>> 1337e2c9647b39781ce6d602b0b4a971ee514ccf
        if(tail > head) {
            int pivot = partition(iA, head, tail);
            quicksort(iA, head, pivot - 1);
            quicksort(iA, pivot + 1, tail);
        }
    }
    
<<<<<<< HEAD
    private int partition(int[] iA, int head, int tail) {
        Random rand = new Random();
        int pivot = rand.nextInt(tail) + 0;
        while(tail > head) {
            while(iA[head] < iA[pivot]) { ++head; }
            while(iA[tail] > iA[pivot]) { --tail; }
            if(tail > head) {
                if(head == pivot) {
                    swap(iA, head, tail);
                    pivot = tail;
                    ++head;
                }
                else if(tail == pivot) {
                    swap(iA, head, tail);
                    pivot = head;
                    --tail;
                }
                else { swap(iA, head, tail); }
            }
        }
        return pivot;
    }
=======
    /*private int partition(int[] iA, int head, int tail) {
        int start = head, end = tail;
        int pivot = head;
        head = head + 1;
        while(head < tail) {
            if(iA[head] <= pivot) {
                
            }
        }
        
    }*/
>>>>>>> 1337e2c9647b39781ce6d602b0b4a971ee514ccf
    
    private void swap(int[] iA, int a, int b) {
        int temp = iA[a];
        iA[a] = iA[b];
        iA[b] = temp;
    }
}
