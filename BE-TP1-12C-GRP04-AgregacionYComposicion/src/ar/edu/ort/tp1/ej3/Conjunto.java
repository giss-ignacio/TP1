package ar.edu.ort.tp1.ej3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Conjunto<T> implements Iterable<T> {
	private List<T> elementos;
	
	public Conjunto() {
		this.elementos = new ArrayList<>();
	}

	public Conjunto(T ... nuevosElementos) {
		this();
		for (T elemento : nuevosElementos) {
			this.elementos.add(elemento);
		}
	}

	public void agregar(T elemento) {
		if (buscar(elemento) == null) {
			this.elementos.add(elemento);
		}
	}
	
	public T buscar(T elemento) {
		T elementoEncontrado = null;
		if (obtenerPosicion(elemento) != -1) {
			elementoEncontrado = elemento;
		}
		return elementoEncontrado;
	}

	 public T remover(T elemento) {
		 int posicion = obtenerPosicion(elemento);
		 T elementoQuitado = null;
		 if (posicion != -1) {
			 this.elementos.remove(posicion);
			 elementoQuitado = elemento;
		 }
		 
		 return elementoQuitado;
	 }
	 
	private int obtenerPosicion(T elemento) {
		int posicionElemento = -1;
		for (int i = 0; i < this.elementos.size(); i++) {
			if (this.elementos.get(i) == elemento) {
				posicionElemento = i;
				break;
			}
		}
		return posicionElemento;
	}

	@Override
	public Iterator<T> iterator() {
		return this.elementos.iterator();
	}
}
