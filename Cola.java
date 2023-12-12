import java.util.ArrayList;

public class Cola<T> implements Secuencia<T> {
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
		return elems.remove(0);
	}

	@Override
	public boolean vacio() {
		return elems.isEmpty();
	}
}