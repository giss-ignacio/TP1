package ar.edu.ort.tp1.ej3;

import java.util.Date;

public class Hito {
	private Date fecha;
	private String descripcion;
	private Conjunto<Persona> personasInvolucradas;
	
	public Hito(Date fecha, String descripcion, Conjunto<Persona> personasInvolucradas) {
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.personasInvolucradas = personasInvolucradas;
		for (Persona persona : this.personasInvolucradas) {
			persona.agregarHito(this);
		}
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public String getFecha() {
		return this.fecha.toString();
	}

	public Conjunto<Persona> getPersonasInvolucradas() {
		return this.personasInvolucradas;
	}

	
}
