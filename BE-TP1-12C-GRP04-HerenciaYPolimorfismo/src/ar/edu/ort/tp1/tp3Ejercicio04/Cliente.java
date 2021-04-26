package ar.edu.ort.tp1.tp3Ejercicio04;

public class Cliente implements Imprimible {

	private String cuil;
	private String nombre;
	
	public Cliente(String cuil, String nombre) {
		this.cuil = cuil;
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "nombre: " + nombre + ", cuil: " + cuil;
	}
	
	@Override
	public void imprimir() {
		System.out.println(toString());
	}
}
