package graph;

import java.util.*;

class Graph {
    private int V; // Number of vertices
    private LinkedList<Integer> adjList[]; // Adjacency List

    // Constructor
    Graph(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge
    void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    // Print Graph
    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (Integer node : adjList[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}

public class Graph2 {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();
    }
}
