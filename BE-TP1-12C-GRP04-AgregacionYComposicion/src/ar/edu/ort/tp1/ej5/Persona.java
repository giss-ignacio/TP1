package ar.edu.ort.tp1.ej5;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String apellido;
	private String nombre;
	private int edad;
	
	
	public Persona(String apellido, String nombre, int edad) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
	}


	public String getNombreYApellido() {
		return nombre + " " + apellido;
	}

	public int getEdad() {
		return edad;
	}
}
