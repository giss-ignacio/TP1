package ar.edu.ort.tp1.ej2;

public class Mascota {
	private String nombre;
	private String tipoDeAnimal;
	
	public Mascota(String nombre, String tipoDeAnimal) {
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
