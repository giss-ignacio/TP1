package ar.edu.ort.tp1.tp3Ejercicio02;

public class Empleado {
	private String nombre;
	private int edad;
	
	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}

	@Override
	public String toString(){
		return "[Nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public float calcularPago(){
		return 0.0f; 
	}
}
