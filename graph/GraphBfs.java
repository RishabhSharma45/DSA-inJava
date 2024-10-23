package graph;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class Graph3{
	int v;
	LinkedList<Integer> adjcList[];
	
	Graph3(int v){
		this.v = v;
		adjcList = new LinkedList[v];
		for	(int i=0;i<v;i++) {
			adjcList[i] = new LinkedList();
		}
	}
	
	void addEdge(int v , int w) {
		adjcList[v].add(w);
	}
	
	void print() {
		for(int i=0;i<v;i++) {
			System.out.print(i +"-> ");
			for(int node : adjcList[i]) {
				System.out.print(node + " ");
			}
			System.out.println();
		}
	}
	
	void bfs(int s) {
		boolean[] visited = new boolean[v];
		Queue<Integer> queue = new LinkedList<>();
		visited[s] = true;
		for(int i=0;i<adjcList[s].size();i++) {
		queue.add(adjcList[s].get(i));
		}
		System.out.print(s+" ");
		while(!queue.isEmpty()) {
			if(visited[queue.peek()]==false) {
				System.out.print(queue.peek()+" ");
				visited[queue.peek()]=true;
				for(int i=0;i<adjcList[queue.peek()].size();i++) {
				queue.add(adjcList[queue.peek()].get(i));
				}
				queue.remove();
			}
			queue.remove();
		}
	}
	
	void dfs(int s) {
		boolean[] visited = new boolean[v];
		Stack<Integer> st = new Stack<>();
		System.out.print(s+" ");
		for(int i=0;i<adjcList[s].size();i++) {
			st.push(adjcList[s].get(i));
		}
		visited[s] = true;
		
		while(!st.isEmpty()) {
			if(visited[st.peek()]==false) {
				System.out.print(st.peek() +" ");
				visited[st.peek()]=true;
				for(int i=0;i<adjcList[st.peek()].size();i++) {
					st.push(adjcList[st.peek()].get(i));
				}
			}
			else {
				st.pop();
			}
		}
	}
	
}

public class GraphBfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph3 g = new Graph3(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 0);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 0);
		g.addEdge(2, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 1);
		g.addEdge(3, 2);
		
		g.print();
		System.out.println();
		g.bfs(0);
		System.out.println();
		g.dfs(0);
		

	}

}
