package graph;

import java.util.ArrayList;

public class Graph1 {
	
	int[][] g1;
	
	Graph1(int s){
	    g1 = new int[s][s];
	    for(int i=0;i<g1.length;i++) {
			for(int j=0;j<g1[i].length;j++) {
				g1[i][j]=0;
			}
		}
	}
	
	void addEdge(int v , int w) {
		g1[v][w] = 1;
	}
	
	void printGraph() {
		for(int i=0;i<g1.length;i++) {
			for(int j=0;j<g1[i].length;j++) {
				if(g1[i][j]==1) {
					System.out.println(i +" "+ j);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2-d array to inisialize a array where 1 denotes edge for that node....
		
				Graph1 g2 = new Graph1(5);
				g2.addEdge(0, 1);
				g2.addEdge(0, 3);
				g2.addEdge(1, 2);
				g2.addEdge(1, 4);
				g2.addEdge(2,4);
				g2.addEdge(3, 4);
				g2.printGraph();
	    
		

	}

}
