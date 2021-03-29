package ar.edu.ort.tp1.ejercicio3;

public class Corredor {
	private final String nombre;
	private double tiempo;
	
	public Corredor(String nombre, Double tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	public boolean esGanador(double otroTiempo) {
		return this.tiempo < otroTiempo;
	}
	
	public boolean esEmpate(double otroTiempo) {
		return this.tiempo == otroTiempo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getTiempo() {
		return tiempo;
	}

}
