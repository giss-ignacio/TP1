package ar.edu.ort.tp1.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
	private String nombre;
	private List<String> integrantes;
	public Grupo(String nombre) {
		super();
		this.nombre = nombre;
		this.integrantes = new ArrayList<>();;
	}
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarIntegrante(String nombreIntegrante) {
		if (buscarIntegrante(nombreIntegrante) == null) {
			integrantes.add(nombreIntegrante);
		}
	}
	
	public int getCantidadIntegrantes() {
		return integrantes.size();
	}
	
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int posicionIntegrante = -1;
		for (int i = 0; i < integrantes.size(); i++) {
			if (integrantes.get(i) == nombreIntegrante) {
				posicionIntegrante = i;
				break;
			}
		}
		return posicionIntegrante;
	}
	
	public String obtenerIntegrante(int posicion) {
		String integrante = null;
		if (posicion <= 1 || posicion >= integrantes.size()) {
			System.out.println("Posicion no valida");
		} else {
			integrante = integrantes.get(posicion-1);
		}
		
		return integrante;
	}
	
	public String buscarIntegrante(String nombreIntegrante) {
		String integranteEncontrado = null;
		if (obtenerPosicionIntegrante(nombreIntegrante) != -1) {
			integranteEncontrado = nombreIntegrante;
		}
		return integranteEncontrado;
	}
	
	 public String removerIntegrante(String nombreIntegrante) {
		 int posicion = obtenerPosicionIntegrante(nombreIntegrante);
		 String integranteQuitado = null;
		 if (posicion != -1) {
			 integrantes.remove(posicion);
			 integranteQuitado = nombreIntegrante;
		 }
		 
		 return integranteQuitado;
	 }
	 
	 private void mostrarIntegrantes() {
		 System.out.println("Cantidad de integrantes: " + integrantes.size());
		 if (!integrantes.isEmpty()) {
			 System.out.println("Integrantes:");
			 for (String integrante : integrantes) {
				 System.out.println("  " + integrante);
			 }
		 }
	 }
	 
	 public void mostrar() {
		 System.out.println("Nombre del grupo: " + nombre);
		 mostrarIntegrantes();
	 }
	 
	 public void vaciar() {
		 integrantes.clear();
	 }
}
