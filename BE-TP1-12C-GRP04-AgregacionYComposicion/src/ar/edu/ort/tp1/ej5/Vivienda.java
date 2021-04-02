package ar.edu.ort.tp1.ej5;

import java.util.ArrayList;
import java.util.List;

public class Vivienda {
	private final Direccion direccion;
	private List<Persona> personas;
	private List<Mueble> muebles;

	public Vivienda(Direccion direccion) {
		this.direccion = direccion;
		this.personas = new ArrayList<>();
		this.muebles = new ArrayList<>();
	}
	
	public void agregarPersona(Persona persona) {
		if (!this.personas.contains(persona)) {
			this.personas.add(persona);
		}
	}
	
	public void agregarMueble(Mueble mueble) {
		this.muebles.add(mueble);
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public List<Mueble> getMuebles() {
		return muebles;
	}
	
	public void mudar(Vivienda destino) {
		for (Persona persona : personas) {
			destino.agregarPersona(persona);
		}
		personas.clear();
		
		for (Mueble mueble : muebles) {
			destino.agregarMueble(mueble);
		}
		muebles.clear();
	}

	public boolean coincide(String piso, String depto) {
		return direccion.coincide(piso, depto);
	}
}
