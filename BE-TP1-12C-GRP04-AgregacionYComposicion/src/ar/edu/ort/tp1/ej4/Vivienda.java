package ar.edu.ort.tp1.ej4;

import java.util.ArrayList;
import java.util.List;

public class Vivienda {
	private final Direccion direccion;
	private List<Persona> personas;
	private List<Mueble> muebles;

	public Vivienda(Direccion direccion) {
		super();
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
	
}
