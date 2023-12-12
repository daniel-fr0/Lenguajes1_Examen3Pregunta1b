import java.util.ArrayList;

public class Pila<T> implements Secuencia<T> {
	ArrayList<T> elems = new ArrayList<T>();

	@Override
	public void agregar(T elem) {
		elems.add(elem);
	}

	@Override
	public T remover() throws SecuenciaVaciaException {
		if (vacio()) {
			throw new SecuenciaVaciaException();
		}
		return elems.remove(elems.size() - 1);
	}

	@Override
	public boolean vacio() {
		return elems.isEmpty();
	}
}