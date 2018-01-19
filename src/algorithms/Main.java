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
        
        int[] iArray = {1, 2, 3, 4, 5, 6, 7};
        Algorithm a = new Algorithm();
        //System.out.println(a.binarySearch(iArray, 2));
        //System.out.println(a.binarySearch(iArray, 7));
        //System.out.println(a.binarySearch(iArray, -1));
        System.out.println(a.binarySearch(iArray, 8));
    }
}
