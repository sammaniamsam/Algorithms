/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.BreadthFirstSearch;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Sam Man
 */
public class Vertex {
    
    private final String name;
    private final List<Vertex> connections;
    
    public Vertex (String name) {
        this.name = name;
        this.connections = new LinkedList<>();
    }
    
    public boolean addConnection(Vertex v) {
        if(this.connections.contains(v)) { return false; }
        else { this.connections.add(v); }
        return true;
    }
    
    public String getName() { return this.name; }
    
    public List<Vertex> getConnections() { return this.connections; }
    
}
