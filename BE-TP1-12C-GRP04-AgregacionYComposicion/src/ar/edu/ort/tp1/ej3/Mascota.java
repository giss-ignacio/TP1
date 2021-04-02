package ar.edu.ort.tp1.ej3;

public class Mascota {
	private String nombre;
	private String tipoDeAnimal;
	
	public Mascota() {
		this.nombre = "";
		this.tipoDeAnimal = "";
	}
	
	public Mascota(String nombre, String tipoDeAnimal) {
		this();
		this.nombre = nombre;
		this.tipoDeAnimal = tipoDeAnimal;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipoDeAnimal() {
		return tipoDeAnimal;
	}

}
