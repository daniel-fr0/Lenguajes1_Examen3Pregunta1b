import java.util.ArrayList;

// clase que representa un grafo dirigido
public class Grafo {
	private int numVertices;
	int getNumVertices() { return numVertices; }
	private ArrayList<ArrayList<Integer>> listaAdyacencia;

	// constructor, recibe el numero de vertices y crea un arraylist de arraylist de enteros de tamaño numVertices
	public Grafo(int numVertices) {
		this.numVertices = numVertices;

		listaAdyacencia = new ArrayList<>(numVertices);

		for(int i = 0; i < numVertices ; i++){
			listaAdyacencia.add(new ArrayList<>());
		}
	}

	// agrega una arista entre los vertices u y v
	public void agregar(int u, int v) {
		listaAdyacencia.get(u).add(v);
	}

	// devuelve los vertices adyacentes al vertice u
	public ArrayList<Integer> adyacentes(int u) {
		return listaAdyacencia.get(u);
	}
}