package ar.edu.ort.tp1.ej4;

public class Persona {
	private String apellido;
	private String nombre;
	private int edad;
	
	public Persona() {
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}
	
	public Persona(String apellido, String nombre, int edad) {
		this();
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
