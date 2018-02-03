/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import algorithms.BinarySearchTest;
import algorithms.EuclidsAlgorithmTest;
import algorithms.QuicksortTest;
import algorithms.SelectionsortTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Sam Man
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    EuclidsAlgorithmTest.class,
    QuicksortTest.class,
    SelectionsortTest.class,
    BinarySearchTest.class
})
public class AlgorithmsTestSuite { }