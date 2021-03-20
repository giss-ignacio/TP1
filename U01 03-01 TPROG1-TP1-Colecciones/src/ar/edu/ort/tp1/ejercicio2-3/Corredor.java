package ar.edu.ort.tp1.ejercicio2_3;

public class Corredor {
	private String nombre;
	private double tiempo;
	
	public Corredor(String nombre, Double tiempo) {
		super();
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
