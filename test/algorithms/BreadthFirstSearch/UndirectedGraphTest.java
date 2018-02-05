/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.BreadthFirstSearch;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Sam Man
 */
public class UndirectedGraphTest {
    
    public UndirectedGraphTest() { }

    /**
     * Test of search method, of class UndirectedGraph.
     */
    @Test
    public void testSearch() {
        
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        Vertex G = new Vertex("G");
        Vertex Z = new Vertex("Z");
        
        A.addConnection(C);
        A.addConnection(B);
        B.addConnection(A);
        B.addConnection(C);
        B.addConnection(E);
        B.addConnection(F);
        C.addConnection(A);
        C.addConnection(D);
        C.addConnection(B);
        D.addConnection(C);
        E.addConnection(B);
        E.addConnection(F);
        F.addConnection(B);
        F.addConnection(E);
        F.addConnection(G);
        G.addConnection(F);
        
        //Starting at root vertex "A"
        assertEquals(UndirectedGraph.search(A, E), 2);
        assertEquals(UndirectedGraph.search(A, G), 3);
        assertEquals(UndirectedGraph.search(A, F), 2);
        assertEquals(UndirectedGraph.search(A, D), 2);
        assertEquals(UndirectedGraph.search(A, A), 0);
        assertEquals(UndirectedGraph.search(A, Z), -1);
        
        //Starting at non-root vertex "E"
        assertEquals(UndirectedGraph.search(E, G), 2);
        assertEquals(UndirectedGraph.search(E, D), 3);
        assertEquals(UndirectedGraph.search(E, C), 2);
        assertEquals(UndirectedGraph.search(E, Z), -1);
    }
    
}
