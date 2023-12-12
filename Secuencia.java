public interface Secuencia<T> {
	void agregar(T elem);
	T remover() throws SecuenciaVaciaException;
	boolean vacio();
}
