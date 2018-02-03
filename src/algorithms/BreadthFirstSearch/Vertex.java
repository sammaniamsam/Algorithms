/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.BreadthFirstSearch;

import java.util.List;

/**
 *
 * @author Sam Man
 */
public class Vertex {
    
    private final String name;
    private final List<Vertex> friends;
    
    public Vertex (String name, List<Vertex> friends ) {
        this.name = name;
        this.friends = friends;
    }
    
    public String getName() { return this.name; }
    
    public List<Vertex> getFriends() { return this.friends; }
    
}
