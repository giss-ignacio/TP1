package ar.edu.ort.tp1.ej5;

public class Mueble {
	private String nombre;
	private String material;
	private String color;

	public Mueble(String nombre, String material, String color) {
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}
	
}
