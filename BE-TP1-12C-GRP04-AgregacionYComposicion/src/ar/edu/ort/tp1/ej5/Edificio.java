package ar.edu.ort.tp1.ej5;

import java.util.ArrayList;
import java.util.List;

public class Edificio {
	List<Vivienda> viviendas;
	
	public Edificio() {
		this.viviendas = new ArrayList<>();
	}
	
	public void realizarMudanza(String pisoOrigen, String deptoOrigen, String pisoDestino, String deptoDestino) {
		int origenIndice = obtenerPosicion(pisoOrigen, deptoOrigen);
		int destinoIndice = obtenerPosicion(pisoDestino, deptoDestino);
		if (origenIndice == -1 || destinoIndice == -1) {
			System.out.println("Error: departamento no encontrado");
		} else {
			Vivienda origen = this.viviendas.get(origenIndice);
			Vivienda destino = this.viviendas.get(destinoIndice);
			
			origen.mudar(destino);
			System.out.printf("SE HA REALIZADO LA MUDANZA DE VIVIENDA %d A VIVIENDA %d\n", origenIndice+1, destinoIndice+1);
		}
		
	}

	public void agregarVivienda(Vivienda vivienda) {
		viviendas.add(vivienda);
	}
	
	private int obtenerPosicion(String piso, String depto) {
		int posicionVivienda = -1;
		int posicionActual = 0;
		while (posicionVivienda == -1 && posicionActual < this.viviendas.size()) {
			if (this.viviendas.get(posicionActual).coincide(piso, depto)) {
				posicionVivienda = posicionActual;
			}
			posicionActual++;
		}
		return posicionVivienda;
	}
	
	public void mostrarTodo() {
		for (int i = 0; i < viviendas.size(); i++) {
			mostrarVivienda(viviendas.get(i), i+1);
		}
	}
	
	/**
	 * Ejemplo:
	 * Vivienda 1: Direccion: Montañeses
	 * 1234 4°”C” Personas: Nombre:
	 * Arturo Roman, Edad: 53 Nombre:
	 * Mónica Gaztambide, Edad: 35
	 * Muebles: Mesa de Madera color
	 * Marrón. Mesada de Mármol color
	 * Rojo Perchero de Metal color
	 * Negro Sillón de Cuero color Azul
	 */
	private void mostrarVivienda(Vivienda vivienda, int numero) {
		System.out.printf("Vivienda %d: Direccion: %s \n Personas: ", numero, vivienda.getDireccion().toString());
		
		for (Persona persona : vivienda.getPersonas()) {
			System.out.printf("Nombre: %s, Edad: %d\n", persona.getNombreYApellido(), persona.getEdad());
		}
		
		System.out.print("Muebles: ");
		for (Mueble mueble : vivienda.getMuebles()) {
			System.out.printf("%s de %s color %s\n", mueble.getNombre(), mueble.getMaterial(), mueble.getColor());
		}
		System.out.println("\n");
	}
}
