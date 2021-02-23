package grafosyArboles;

import java.util.ArrayList;

public class GraphList {
	//lista de adyacencia
	
	//agregar vertices
	public void addEdge(ArrayList<ArrayList<Integer>>
	adj, int u, int v) {
		
		adj.get(u).add(v);
		adj.get(v).add(u);
		
	}
	
	//imprimir o graficar
	public void printGraph(ArrayList<ArrayList<Integer>> adj) {
		for (int i = 0; i<adj.size(); i++) {
			System.out.println("\n lista de adyacencia del vertice"+i);
			System.out.print("head");
			for(int j= 0; j<adj.get(i).size();j++) {
				System.out.print("->"+adj.get(i).get(j));
			}
		}
	}
	
	public static void main(String args[]) {
		//grafo con 5 vertices
		int V = 5;
		//construir la lista
		ArrayList<ArrayList<Integer>> adj =
				new ArrayList<ArrayList<Integer>> (V);
		//crear el grafo
		GraphList adj1 = new GraphList();
		//armando e inicializando toda la lista
		for (int i = 0; i< V; i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		//agregar los nodos en la lista de adyacencia
		adj1.addEdge(adj, 0, 1);
		adj1.addEdge(adj, 0, 4);
		adj1.addEdge(adj, 1, 2);
		adj1.addEdge(adj, 1, 3);
		adj1.addEdge(adj, 1, 4);
		adj1.addEdge(adj, 2, 3);
		adj1.addEdge(adj, 3, 4);


		//imprimir el grafo
		adj1.printGraph(adj);

		
		
		
	}
}


