/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.BreadthFirstSearch;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author Sam Man
 */
public class UndirectedGraph {
    
    public static int search(Vertex start, Vertex target) {
        LinkedList<Vertex> queue = new LinkedList();
        Map<String, Vertex> searchedVerticies = new HashMap<>(); 
        queue.add(start);
        int verticiesOnLevel = queue.size();
        int edges = 0;
        while (!queue.isEmpty()) {
            Vertex v = queue.remove();
            --verticiesOnLevel;
            searchedVerticies.put(v.getName(), v);
            if(target.getName().equals(v.getName())) { return edges; }
            else {
                for(Vertex vertex: v.getFriends()) {
                    if(!searchedVerticies.containsKey(vertex.getName())) {
                        queue.add(vertex);
                    }
                }
                if(verticiesOnLevel <= 0) {
                    ++edges;
                    verticiesOnLevel = queue.size();
                }
            }
        }
        return -1;
    }
    
}
