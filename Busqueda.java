public abstract class Busqueda {
	private Grafo grafo;
	protected Secuencia<Integer> secuencia;

	public Busqueda(Grafo grafo) {
		this.grafo = grafo;
	}

	int buscar(int D, int H) {
		if (D == H) return 0;

		boolean[] visitados = new boolean[grafo.getNumVertices()];
		int explorados = 0;

		// Se empieza la busqueda en el nodo inicial
		secuencia.agregar(D);
		visitados[D] = true;

		while(!secuencia.vacio()) {
			// Se obtiene el siguiente nodo a explorar
			int nodo;
			try {
				nodo = secuencia.remover();
			} catch (SecuenciaVaciaException e) {
				// Esto no deberia pasar nunca
				return -1;
			}

			// Se marca el nodo como visitado y se cuenta como explorado
			visitados[nodo] = true;
			explorados++;

			// Se termina la busqueda si se llega al nodo final
			if(nodo == H) return explorados;

			// Se agregan los nodos adyacentes no visitados a la secuencia y se marcan como visitados
			for(int adyacente : grafo.adyacentes(nodo)) {
				if(!visitados[adyacente]) {
					secuencia.agregar(adyacente);
				}
			}
		}

		// Si se llega a este punto, no se encontro el nodo final
		return -1;
	}
}