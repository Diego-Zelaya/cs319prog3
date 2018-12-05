package edu.sdsu.cs.datastructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.TreeMap;


private int myNumVertices;
private int myNumEdges;



/*
 * Identifies the functions required for a graph object.
 *
 * @param <V> The type to use for unique vertex names (e.g. String)
 */
    class DirectedGraph {

    public class inter <V> implements IGraph<V>{
    //IGraph<V> igraph =new IGraph<V>() {

        //public void add(V vertexName);
        //public void connect(V start, V destination);
        //public boolean contains(V label);
        //public void clear();
        //public boolean contains(V label);
        //public void disconnect(V start, V destination);
        //public boolean isConnected(V start, V destination);
        //public Iterable<V> neighbors(V vertexName);
        //public void remove(V vertexName);
        //public List<V> shortestPath(V start, V destination);
        //public int size();
        //public Iterable<V> vertices();
        //public IGraph<V> connectedGraph(V origin);




    /*
     * Inserts a vertex with the specified name into the Graph if it
     * is not already present.
     *
     * @param vertexName The label to associate with the vertex
     */
    @Override
    public void add(V vertexName) {

        Vertex v;
        v = myVertices.get(name);
        if (v == null) {
            v = new Vertex(name);
            myVertices.put(name, v);
            myAdjList.put(v, new TreeSet<Vertex>());
            myNumVertices += 1;
        }
        return v;

    }




    /*
     * Adds a connection between the named vertices if one does not
     * yet exist.
     *
     * @param start The first vertex for the edge
     * @param destination The second vertex
     * @throws java.util.NoSuchElementException if either vertex are
     * not present in the graph
     */
    @Override
        public void connect(V start, V destination) {

        }



    /*
     * Resets the graph to an empty state.
     */
    @Override
        public void clear() {

        }



    /*
     * Reports if a vertex with the specified label is stored within
     * the graph.
     *
     * @param label The vertex name to find
     * @return true if within the graph, false if not.
     */
    @Override
    public boolean contains(V label) {
        return false;
    }


    /*
     * Removes the specified edge, if it exists, from the Graph.
     *
     * @param start The name of the origin vertex
     * @param destination The name of the terminal vertex
     * @throws java.util.NoSuchElementException if either vertex are
     * not present in the graph
     */
    @Override
    public void disconnect(V start, V destination) {

    }



    /*
     * Identifies if a path exists between the two vertices.
     *
     * When the start and destination node names are the same, this
     * method shall only return true if there exists a self-edge on
     * the specified vertex.
     *
     * @param start The initial Vertex
     * @param destination The terminal vertex
     * @return True if any path exists between them
     * @throws java.util.NoSuchElementException if either vertex are
     * not present in the graph
     */
    @Override
    public boolean isConnected(V start, V destination) {
        return false;
    }



    /*
     * Provides a collection of vertex names directly connected
     * through a single outgoing edge to the target vertex.
     *
     * Changes to the returned Iterable object (e.g., .remove())
     * shall NOT impact or change the graph.
     *
     * @param vertexName The target vertex
     * @return An iterable, possibly empty, containing all
     * neighboring vertices.
     * @throws java.util.NoSuchElementException if the vertex is not
     * present in the graph
     */
    @Override
    public Iterable<V> neighbors(V vertexName) {
        return V;
    }



    /*
    * Deletes all trace of the specified vertex from within the
    * graph.
    *
    * This method deletes the vertex from the graph as well as every
    * edge using the specified vertex as a start (out) or
    * destination (in) vertex.
    *
    * @param vertexName The vertex name to remove from the graph
    * @throws java.util.NoSuchElementException if the origin vertex
    * is not present in this graph
    */
    @Override
    public void remove(V vertexName) {

    }



    /*
     * Returns one shortest path through the graph from the starting
     * vertex and ending in the destination vertex.
     *
     * @param start The vertex from which to begin the search
     * @param destination The terminal vertex within the graph
     * @return A sequence of vertices to visit requiring the fewest
     * steps through the graph from its starting position
     * (at index 0 in the list) to its terminus at the list's end.
     * If no path exists between the nodes, this method
     * returns an empty list.
     * @throws java.util.NoSuchElementException if either vertex are
    not present in the graph
     */
    @Override
    public List<V> shortestPath(V start, V destination) {

            final int INF = Integer.MAX_VALUE; //INF

            start = null;
            destination = null;
            double weight = 0;
            List<V> ListArray = new ArrayList<>();

            //IGraph<V> igraph =new IGraph[];


            if (weight == 0 && start == destination)
                return ListArray = null;

            if (weight == 1 && IGraph[start][destination] != INF)
                return IGraph [start][destination];

            if (weight <= 0)
                return INF;

            V res = INF;

            // Go to all adjacents of u and recur
            for (int i = 0; i < V; i++)
            {
                if (IGraph[start][i] != INF && start != i && destination != i)
                {
                    int rec_res = shortestPath(IGraph, i, destination, weight-1);
                    if (rec_res != INF)
                        res = Math.min(res, IGraph[start][i] + rec_res);
                }
            }
            return res;
    }



    /*
     * Reports the number of vertices in the Graph.
     *
     * @return a non-negative number.
     */
    @Override
        public int size() {
            return 0;
        }



    /*
     * Provides a collection of vertex names currently in the graph.
     *
     * @return The names of the vertices within the graph.
     */
        @Override
        public Iterable<V> vertices() {
            return V;
        }




    /*
     * Produces a graph of only those vertices and edges reachable
     * from the origin vertex.
     *
     * @param origin The vertex to build the graph from
    * @return A new graph with only the Vertices and Edges
    * reachable from the parameter Vertex.
    * @throws java.util.NoSuchElementException if the origin vertex
    * is not present in this graph
    */
        @Override
        public IGraph<V> connectedGraph(V origin) {
            return V;
        }


}
