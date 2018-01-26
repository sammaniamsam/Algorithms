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
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] iArray = {3,1};
        int x = iArray[0];
        System.out.println(x);
        Algorithm a = new Algorithm();
        a.quicksort(iArray);
        for(int i: iArray) { System.out.println(i); }
        System.out.println(x);
        
    }
}
