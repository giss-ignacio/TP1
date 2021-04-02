package ar.edu.ort.tp1.ej3;

import java.util.ArrayList;

public class Hito {
	private String fecha;
	private String descripcion;
	private ArrayList<Persona> personasInvolucradas;
	
	public Hito() {
		this.fecha = "";
		this.descripcion = "";
		this.personasInvolucradas = new ArrayList<>();
	}
	
	public Hito(String fecha, String descripcion, ArrayList<Persona> personasInvolucradas) {
		this();
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.personasInvolucradas.addAll(personasInvolucradas);
		for (Persona persona : this.personasInvolucradas) {
			persona.agregarHito(this);
		}
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public String getFecha() {
		return this.fecha;
	}

	public ArrayList<Persona> getPersonasInvolucradas() {
		return this.personasInvolucradas;
	}
	
}
