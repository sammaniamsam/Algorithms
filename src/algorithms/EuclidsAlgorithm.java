/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author samuel
 */
public class EuclidsAlgorithm {
    
    /**
     * This method divides a space, that has sides a
     * and b, evenly into the biggest square plots that
     * can be formed.
     * @param a Side of space
     * @param b Side of space
     * @return int Side of biggest square that the space can
     * be evenly divided into.
    */
    public int divideSpace(int a, int b) {
        if((a % b == 0) || (b % a == 0)) {
            int rVal = b > a ? a : b;
            return rVal;
        } else {
            if(a > b) { return divideSpace(a - b, b); }
            else { return divideSpace(a, b - a); }
        }
    }
}
