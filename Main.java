public class Main {
	public static void main(String[] args) {
		Grafo grafo = new Grafo(7);
		grafo.agregar(0, 1);
		grafo.agregar(0, 2);
		grafo.agregar(1, 3);
		grafo.agregar(1, 4);
		grafo.agregar(2, 5);
		grafo.agregar(2, 6);

		Busqueda busqueda = new BFS(grafo);
		System.out.print("Nodos explorados con BFS: ");
		System.out.println(busqueda.buscar(0, 5));

		busqueda = new DFS(grafo);
		System.out.print("Nodos explorados con DFS: ");
		System.out.println(busqueda.buscar(0, 5));
	}
}
