/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.BreadthFirstSearch;

import java.util.LinkedList;

/**
 *
 * @author Sam Man
 */
public class UndirectedGraph {
    
    //Keep a queue containing the people to check
    private final LinkedList<Vertex> queue;
    
    public UndirectedGraph(Vertex v) {
        this.queue = new LinkedList();
        this.queue.add(v);
    }
    
    public int search(Vertex target) {
        int edges = 0;
        while (!this.queue.isEmpty()) {
            Vertex v = this.queue.remove();
            
        }
        return edges;
        //If this person been searched before
            //Dequeue person from queue
        //Check if this person is the person you are looking for
            //If yes
                //Done
            //Else
                //Enqueue all their friends to the list
    }
    
}
