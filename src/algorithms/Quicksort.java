/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Random;

/**
 *
 * @author samuel
 */
public class Quicksort {
    
    
    /**
     * This method takes an unsorted array of integers and
     * sorts that array using quicksort.
     * Average Case: O(nlogn)
     * Worst Case: O(n^2)
     * @param iA Unsorted array of integers
    */
    public void sort(int[] iA) {
        sort(iA, 0, iA.length - 1);
    }
    
    private void sort(int[] iA, int head, int tail) {
        //base case
        if(tail > head) {
            int pivot = partition(iA, head, tail);
            sort(iA, head, pivot - 1);
            sort(iA, pivot + 1, tail);
        }
    }
    
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
    
    private void swap(int[] iA, int a, int b) {
        int temp = iA[a];
        iA[a] = iA[b];
        iA[b] = temp;
    }
    
}
