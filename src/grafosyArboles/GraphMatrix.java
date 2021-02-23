package grafosyArboles;

public class GraphMatrix {

	//matriz de adyacencia
	private boolean adjMatrix[][];
	  private int numVertices;
	  
	  //inicializar la matriz
	  public GraphMatrix (int numVertices) {
		  this.numVertices=numVertices;
		  adjMatrix = new boolean[numVertices][numVertices];
	  }
	  
	  //add edges
	  public void addEdge(int i, int j) {
		  adjMatrix[i][j] = true;
		  adjMatrix[j][i] = true;

	  }
	  
	  //remove edges
	  public void removeEdge(int i, int j) {
		  adjMatrix[i][j] = false;
		  adjMatrix[j][i] = false;

	  }
	  
	  //imprimir matriz
	  public String toString() {
		  StringBuilder s = new StringBuilder();
		  for (int i = 0; i<numVertices; i++) {
			  s.append(i + ": ");
			  for (boolean j: adjMatrix[i]) {
				  s.append((j ? 1 : 0)+ " ");
			  }
			  s.append("\n");
		  }
		  return s.toString();
	  }
	
	public static void main(String args[]) {
		
		GraphMatrix g = new GraphMatrix(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		
		System.out.print(g.toString());
		
	}
}
