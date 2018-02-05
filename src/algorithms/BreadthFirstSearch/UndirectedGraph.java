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
    
    /**
     * This method is used to find the shortest path from
     * the start vertex to the target vertex using breadth
     * first search.
     * Runtime: O(V + E) -- V is Verticies, E is Edges
     * @param start Vertex at which you will start from.
     * @param target Vertex you are searching for.
     * @return int This is the number of edges between the start and
     * target verticies.
    */
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
                for(Vertex vertex: v.getConnections()) {
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
